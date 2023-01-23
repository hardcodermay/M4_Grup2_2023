package productstore.actions.addtocart;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static productstore.ui.AddToCartPage.ADD_TO_CART_PRODUCT_NAME;

public class AddToCartActionResults extends UIInteractionSteps {
    @Managed
    WebDriver driver;
    @Step("")
    public String getClickedProduct() {
        //Realizar espera de 5s - Carga el primer producto de la categoría
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoAlertPresentException.class);

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String ok = alert.getText();
        alert.accept();
        return ok;
    }

/*
    @Step("")
    public String getWebElementText(WebElement visited) {
        return visited.getText();
    }
 */
}
