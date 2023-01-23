package productstore;

import JavaCode.HexExtension;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import productstore.actions.navigate.Navigator;
import productstore.actions.signup.SignUp;
import productstore.actions.signup.SignUpActionResults;

import static org.assertj.core.api.Assertions.assertThat;
public class SignUpStepDefinitions {
    @Managed
    WebDriver driver;
    private static String USERNAME;
    private static final String SIGN_UP_CONFIRMATION_TEXT = "Sign up successful.";

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
        driver.manage().window().maximize();
        navigate.toLandingPage();
    }

    @When("to sign up he uses {string} and {string} as password")
    public void sign_heUsesM_grupoAsTheUsernameAndDevopsmGAsPassword(String username, String password) {
        register.SignUpUser(USERNAME, password);
    }

    @Then("he should see {string} on the SigUp Results Page once Signed")
    public void sign_heShouldSeeWelcomeM_grupoOnTheSigUpResultsPage(String result) {
        String message = SignUp.getAlertText();
        assertThat(signedUserResults.getSignUpResults(message)).isEqualTo(SIGN_UP_CONFIRMATION_TEXT);
    }
}
