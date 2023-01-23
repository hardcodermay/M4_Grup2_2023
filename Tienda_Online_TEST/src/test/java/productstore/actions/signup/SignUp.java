package productstore.actions.signup;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static productstore.ui.LandingPage.SIGNUP_BUTTON;
import static productstore.ui.LandingPage.SIGNUP_USERNAME_FIELD;
import static productstore.ui.LandingPage.SIGNUP_PASSWORD_FIELD;
import static productstore.ui.LandingPage.SIGNUP_CONFIRMATION_BUTTON;

public class SignUp extends UIInteractionSteps {

    public static String alertText = "";
    @Step("")
    public void SignUpUser(String username, String password) {
        find(SIGNUP_BUTTON).click();
        find(SIGNUP_USERNAME_FIELD).type(username);
        find(SIGNUP_PASSWORD_FIELD).type(password);
        find(SIGNUP_CONFIRMATION_BUTTON).click();
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alertText = alert.getText();
            alert.accept();
        }
        catch(Exception e) {}
    }

    public static String getAlertText() {
        return alertText;
    }


}
