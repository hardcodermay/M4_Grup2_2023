package productstore.actions.navigate;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import productstore.ui.LandingPage;

import static productstore.ui.LandingPage.*;

public class Navigator extends UIInteractionSteps {

    public WebElement[] resultados = new WebElement[3];
    LandingPage landing;
    @Step("")
    public void toLandingPage() {
        landing.open();
    }

    @Step("")
    public void clickOneCategory(int index) {
        WebElement X = null;
        switch (index) {
            case 0 -> {
                X = find(PHONES_CATEGORY_LABEL);
                X.click();
            }
            case 1 -> {
                X = find(LAPTOPS_CATEGORY_LABEL);
                X.click();
            }

            case 2 -> {
                X = find(MONITORS_CATEGORY_LABEL);
                X.click();
            }
        }
        resultados[index] = X;
    }

    public WebElement[] getvisitedCategories() {
        return resultados;
    }

}
