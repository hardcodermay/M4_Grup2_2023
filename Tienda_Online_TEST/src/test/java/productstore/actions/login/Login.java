package productstore.actions.login;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static productstore.ui.LandingPage.LOGIN_BUTTON;
import static productstore.ui.LandingPage.LOGIN_USERNAME_FIELD;
import static productstore.ui.LandingPage.LOGIN_PASSWORD_FIELD;
import static productstore.ui.LandingPage.LOGIN_CONFIRMATION_BUTTON;

public class Login extends UIInteractionSteps{

    @Step("")
    public void LoginUser(String username, String password) {
        find(LOGIN_BUTTON).click();
        find(LOGIN_USERNAME_FIELD).type(username);
        find(LOGIN_PASSWORD_FIELD).type(password);
        find(LOGIN_CONFIRMATION_BUTTON).click();

        //Realizar espera de 5s - botón de confirmación de SigUp
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("//*[@id='logInModal']/div/div/div[3]/button[2]")));
    }
}
