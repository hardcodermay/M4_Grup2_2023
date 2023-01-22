package productstore;

import JavaCode.HexExtension;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import productstore.actions.login.Login;
import productstore.actions.login.LoginActionResults;
import productstore.actions.navigate.Navigator;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginStepDefinitions {
    private static String USERNAME;

    private void getUserName() {
        HexExtension un = new HexExtension();
        USERNAME = un.userGenerator();
    }

    public LoginStepDefinitions() {
        getUserName();
    }

    @Steps
    Navigator navigate;

    @Steps
    Login access;

    @Steps
    LoginActionResults loggedUserResults;
    @Given("Francisco wants to log in at the website using username and password")
    public void franciscoWantsToLogInAtTheWebsiteUsingUsernameAndPassword() {
        navigate.toLandingPage();
    }

    @When("")
    public void heUsesM_grupoAsTheUsernameAndDevopsmGAsPassword(String username, String password) {
        access.LoginUser(USERNAME, password);
    }

    @Then("he should see {string} on the Login Results Page")
    public void heShouldSeeWelcomeM_grupoOnTheLoginResultsPage(String result) {
        assertThat(loggedUserResults.getLoginResults("Welcome "+USERNAME)).isEqualTo("Welcome "+USERNAME);
    }
}
