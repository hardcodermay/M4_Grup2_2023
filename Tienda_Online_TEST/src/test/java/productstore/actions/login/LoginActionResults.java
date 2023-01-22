package productstore.actions.login;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import static productstore.ui.LoginResult.LOGIN_WELCOME_USERNAME;

public class LoginActionResults extends UIInteractionSteps {
    @Step("")
    public String getLoginResults(String result) {
        return find(LOGIN_WELCOME_USERNAME).getText();
    }
}
