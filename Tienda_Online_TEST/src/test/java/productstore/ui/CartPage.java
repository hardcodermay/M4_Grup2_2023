package productstore.ui;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.demoblaze.com/cart.html")
public class CartPage extends PageObject {

    public final static By PRODUCT_TO_ELIMINATE_LABEL = By.xpath("/html/body/div[6]/div/div[1]/div/table/tbody/tr[3]/td[4]/a");

    public final static By TOTAL_LABEL = By.xpath("/html/body/div[6]/div/div[2]/div/div/h3");

    public final static By PAYMENT_CART_BUTTON = By.xpath("//*[@id='page-wrapper']/div/div[2]/button");

    public final static By PAYMENT_FORM_TITLE_LABEL = By.xpath("//*[@id='orderModalLabel']");

}