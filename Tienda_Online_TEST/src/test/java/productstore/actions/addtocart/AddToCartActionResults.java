package productstore.actions.addtocart;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

public class AddToCartActionResults extends UIInteractionSteps {

    @Step("")
    public String getClickedProduct(String[] arr, int index) {
        return arr[index];
    }
}
