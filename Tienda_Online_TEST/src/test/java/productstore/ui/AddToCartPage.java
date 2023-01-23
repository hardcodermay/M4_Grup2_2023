package productstore.ui;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import java.time.Duration;


public class AddToCartPage extends PageObject {

    public static By getCartButton() {
        return By.xpath("//*[@id='tbodyid']/div[2]/div/a");
    }

    public static By getCartProdName() {
        return By.xpath("//*[@id='tbodyid']/h2");
    }

}