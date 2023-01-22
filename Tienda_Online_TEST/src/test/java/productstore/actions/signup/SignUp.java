package productstore.actions.signup;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static productstore.ui.LandingPage.*;

public class SignUp extends UIInteractionSteps {

    @Step("")
    public void SignUpUser(String username, String password) {
        find(SIGN_UP_BUTTON).click(); //falta la acción de click
        find(USERNAME_FIELD).type(username);
        find(PASSWORD_FIELD).type(password);
        find(SIGN_UP_CONFIRMATION_BUTTON).click(); //falta la acción de click
    }
}
