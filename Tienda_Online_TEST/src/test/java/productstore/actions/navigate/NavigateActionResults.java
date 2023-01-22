package productstore.actions.navigate;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

public class NavigateActionResults extends UIInteractionSteps {
    /*
    @Step("")
    public String getNavResults() {
        //Realizar espera de 2s - Carga el primer producto de la categoría
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(find(FIRST_PRODUCT_CARD_OF_CATEGORY)));

        return find(FIRST_PRODUCT_NAME_OF_CATEGORY).getText();
    }
    */

    @Step("")
    public String getWebElementText(WebElement visited) {
        return visited.getText();
    }
}
