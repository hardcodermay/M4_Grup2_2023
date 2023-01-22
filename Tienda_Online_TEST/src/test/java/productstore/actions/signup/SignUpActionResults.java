package productstore.actions.signup;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpActionResults extends UIInteractionSteps {
    @Step("")
    public String getSignUpResults(String result) {
        //Realizar espera de 5s - botón de confirmación de SigUp
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String ok = alert.getText();
        alert.accept();
        return ok;
    }
}
