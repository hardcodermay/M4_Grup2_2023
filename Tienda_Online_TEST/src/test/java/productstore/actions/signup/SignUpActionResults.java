package productstore.actions.signup;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static productstore.ui.SignUpResult.SIGNUP_WELCOME_USERNAME;

public class SignUpActionResults extends UIInteractionSteps {
    @Step("")
    public String getSignUpResults(String result) {
        return find(SIGNUP_WELCOME_USERNAME).getText();
    }
}
