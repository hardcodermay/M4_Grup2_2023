package productstore.actions.addtocart;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import productstore.actions.navigate.Navigator;
import productstore.ui.LandingPage;

import java.time.Duration;

import static productstore.ui.AddToCartPage.ADD_TO_CART_BUTTON;
import static productstore.ui.LandingPage.*;

public class AddToCart extends UIInteractionSteps {

    Navigator navigate;

    public WebElement[] resultados = new WebElement[3];
    LandingPage landing;
    @Step("")
    public void toLandingPage() {
        landing.open();
    }

    @Step("")
    public void addOneProductToCart(int cat, int prod) {
        navigate.clickOneCategory(cat);
        navigate.clickOneProduct(prod);
        find(ADD_TO_CART_BUTTON).click();
    }

    public WebElement[] getvisitedCategories() {
        return resultados;
    }

}
