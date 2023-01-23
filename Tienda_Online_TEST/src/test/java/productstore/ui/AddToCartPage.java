package productstore.ui;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import java.time.Duration;


public class AddToCartPage extends PageObject {

    //Landing Controls
    //public static By ADD_TO_CART_BUTTON;

    //public static By ADD_TO_CART_PRODUCT_NAME;

    public static By getCartButton() {
        return By.xpath("//*[@id='tbodyid']/div[2]/div/a");
    }

    public static By getCartProdName() {
        return By.xpath("//*[@id='tbodyid']/h2");
    }

}