package productstore.actions.navigate;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import productstore.ui.LandingPage;

import static productstore.ui.LandingPage.*;

public class Navigator extends UIInteractionSteps {

    public WebElement[] resultados = new WebElement[3];
    public WebElement[] productos = new WebElement[3];
    LandingPage landing;
    @Step("")
    public void toLandingPage() {
        landing.open();
    }

    @Step("")
    public void toCartPage() {
        find(Cart_Nav_Item).click();
    }

    @Step("")
    public void toHomePage() {
        find(Home_Nav_Item).click();
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
    @Step("")
    public void clickOneProduct(int index) {
        WebElement X = null;
        switch (index) {
            case 0 -> {
                X = find(FIRST_PRODUCT);
                X.click();
            }
            case 1 -> {
                X = find(SECOND_PRODUCT);
                X.click();
            }

            case 2 -> {
                X = find(THIRD_PRODUCT);
                X.click();
            }
        }
        productos[index] = X;
    }
    public WebElement[] getvisitedCategories() {
        return resultados;
    }
    public WebElement[] getAddedProducts() {
        return productos;
    }

}
