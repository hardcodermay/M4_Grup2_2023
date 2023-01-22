package productstore;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import productstore.actions.navigate.Navigator;
import productstore.actions.signup.SignUp;

public class SignUpStepDefinitions {

    @Steps
    Navigator navigate;

    @Steps
    SignUp register;

    @Given("Francisco wants to sign up at the website using username and password")
    public void franciscoWantsToSignUpAtTheWebsiteUsingUsernameAndPassword() {
        navigate.toLandingPage();
    }

    @When("he uses {string} as the username and {string} as password")
    public void heUsesM_grupoAsTheUsernameAndDevopsmGAsPassword(String username, String password) {
        register.SignUpUser(username, password);
    }

    @Then("he should see {string} on the SigUp Results Page")
    public void heShouldSeeWelcomeM_grupoOnTheSigUpResultsPage(String result) {
    }
}
