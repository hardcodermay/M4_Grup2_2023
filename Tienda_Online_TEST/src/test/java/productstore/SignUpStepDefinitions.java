package productstore;

import JavaCode.HexExtension;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import productstore.actions.navigate.Navigator;
import productstore.actions.signup.SignUp;
import productstore.actions.signup.SignUpActionResults;

import static org.assertj.core.api.Assertions.assertThat;
public class SignUpStepDefinitions {

    private static String USERNAME;

    private void getUserName() {
        HexExtension un = new HexExtension();
        USERNAME = un.userGenerator();
    }

    public SignUpStepDefinitions() {
        getUserName();
    }
    @Steps
    Navigator navigate;

    @Steps
    SignUp register;

    @Steps
    SignUpActionResults signedUserResults;

    @Given("Francisco wants to sign up at the website using username and password")
    public void sign_franciscoWantsToSignUpAtTheWebsiteUsingUsernameAndPassword() {
        navigate.toLandingPage();
    }

    @When("to sign up he uses {string} as the username and {string} as password")
    public void sign_heUsesM_grupoAsTheUsernameAndDevopsmGAsPassword(String username, String password) {
        register.SignUpUser(USERNAME, password);
    }

    @Then("he should see {string} on the SigUp Results Page once Signed")
    public void sign_heShouldSeeWelcomeM_grupoOnTheSigUpResultsPage(String result) {
        assertThat(signedUserResults.getSignUpResults("Welcome "+USERNAME)).isEqualTo("Welcome "+USERNAME);
    }
}
