package productstore;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import productstore.actions.login.Login;
import productstore.actions.login.LoginActionResults;
import productstore.actions.navigate.Navigator;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginStepDefinitions {

    @Steps
    Navigator navigate;

    @Steps
    Login access;

    @Steps
    LoginActionResults loggedUserResults;
    @Given("Francisco wants to log in at the website using username and password")
    public void login_franciscoWantsToLogInAtTheWebsiteUsingUsernameAndPassword() {
        navigate.toLandingPage();
    }

    @When("to login he uses {string} as the username and {string} as password")
    public void login_heUsesM_grupoAsTheUsernameAndDevopsmGAsPassword(String username, String password) {
        access.LoginUser(username, password);
    }

    @Then("he should see {string} on the Login Results Page once Logged")
    public void login_heShouldSeeWelcomeM_grupoOnTheLoginResultsPage(String result) {
        assertThat(loggedUserResults.getLoginResults(result)).isEqualTo(result);
    }
}
