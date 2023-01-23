package productstore.actions.removefromcart;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import static productstore.ui.CartPage.PRODUCT_TO_ELIMINATE_LABEL;

public class RemoveFromCartActionResults extends UIInteractionSteps {
    @Step("")
    public String getProductResults(String result) {
        return find(PRODUCT_TO_ELIMINATE_LABEL).getText();
    }
    @Steps
    RemoveFromCart remover;

    public String verifyProductResults(String result) {
            result = remover.getTotalToPay();
        return result;
    }
}
