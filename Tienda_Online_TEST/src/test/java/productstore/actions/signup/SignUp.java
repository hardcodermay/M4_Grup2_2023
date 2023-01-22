package productstore.actions.signup;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static productstore.ui.LandingPage.SIGNUP_BUTTON;
import static productstore.ui.LandingPage.SIGNUP_USERNAME_FIELD;
import static productstore.ui.LandingPage.SIGNUP_PASSWORD_FIELD;
import static productstore.ui.LandingPage.SIGNUP_CONFIRMATION_BUTTON;

public class SignUp extends UIInteractionSteps {

    @Step("")
    public void SignUpUser(String username, String password) {
        find(SIGNUP_BUTTON).click();
        find(SIGNUP_USERNAME_FIELD).type(username);
        find(SIGNUP_PASSWORD_FIELD).type(password);
        find(SIGNUP_CONFIRMATION_BUTTON).click();

    }
}
