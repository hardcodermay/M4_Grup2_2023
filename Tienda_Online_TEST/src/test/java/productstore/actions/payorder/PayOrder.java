package productstore.actions.payorder;


import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static productstore.ui.CartPage.PAYMENT_CART_BUTTON;
import static productstore.ui.CartPage.PAYMENT_FORM_TITLE_LABEL;

public class PayOrder extends UIInteractionSteps {

    public String message = "";
    private final static By NAME_PAYMENT_FIELD = By.xpath("//*[@id='name']");
    private final static By COUNTRY_PAYMENT_FIELD = By.xpath("//*[@id='country']");
    private final static By CITY_PAYMENT_FIELD = By.xpath("//*[@id='city']");
    private final static By CREDITCARD_PAYMENT_FIELD = By.xpath("//*[@id='card']");
    private final static By MONTH_PAYMENT_FIELD = By.xpath("//*[@id='month']");
    private final static By YEAR_PAYMENT_FIELD = By.xpath("//*[@id='year']");
    private final static By CONFIRM_PAYMENT_BUTTON = By.xpath("//*[@id='orderModal']/div/div/div[3]/button[2]");

    @Step("")
    public void fillPaymentForm() {
        find(PAYMENT_CART_BUTTON).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOfElementLocated(PAYMENT_FORM_TITLE_LABEL));
        find(NAME_PAYMENT_FIELD).type("Francisco");
        find(COUNTRY_PAYMENT_FIELD).type("España");
        find(CITY_PAYMENT_FIELD).type("Barcelona");
        find(CREDITCARD_PAYMENT_FIELD).type("XXXX-9836-2345-34XX");
        find(MONTH_PAYMENT_FIELD).type("Enero");
        find(YEAR_PAYMENT_FIELD).type("2023");
        find(CONFIRM_PAYMENT_BUTTON).click();
        try {
            String xpathMessageConfirm = "/html/body/div[11]/h2";
            wait.until(ExpectedConditions.visibilityOf(find(By.xpath(xpathMessageConfirm))));
            message = find(By.xpath(xpathMessageConfirm)).getText();
            String xpathButtonConfirm = "/html/body/div[11]/div[7]/div/button";
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathButtonConfirm)));
            find(By.xpath(xpathButtonConfirm)).click();
        }
        catch(Exception e) {}

    }

    public String getAlertMessage() {
        return message;
    }
}
