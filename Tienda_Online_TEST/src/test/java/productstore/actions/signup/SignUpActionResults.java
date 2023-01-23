package productstore.actions.signup;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class SignUpActionResults extends UIInteractionSteps {
    @Step("")
    public String getSignUpResults(String result) {
        return result;
    }
}
