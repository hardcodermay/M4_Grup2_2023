package productstore.actions.addtocart;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import productstore.actions.navigate.Navigator;
import productstore.ui.AddToCartPage;
import productstore.ui.LandingPage;

import java.time.Duration;

//import static productstore.ui.AddToCartPage.ADD_TO_CART_BUTTON;
//import static productstore.ui.AddToCartPage.ADD_TO_CART_PRODUCT_NAME;

public class AddToCart extends UIInteractionSteps {

    public String[] added = new String[3];

    Navigator navigate;

    LandingPage landing;
    @Step("")
    public void toLandingPage() {
        landing.open();
    }

    @Step
    public void toHomePage() { landing.open(); }

    @Step("")
    public void addOneProductToCart(int cat, int prod) {
        navigate.clickOneCategory(cat);
        navigate.clickOneProduct(prod);
        find(AddToCartPage.getCartButton()).click();
        added[prod] = find(AddToCartPage.getCartProdName()).getText();
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            alert.accept();
        }
        catch(Exception e) {}
        toHomePage();
    }

    public String[] getAddedProducts() {
        return added;
    }

}
