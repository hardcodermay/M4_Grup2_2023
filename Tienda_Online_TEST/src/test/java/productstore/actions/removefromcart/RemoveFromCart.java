package productstore.actions.removefromcart;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import productstore.actions.navigate.Navigator;
import productstore.ui.CartPage;

import java.time.Duration;

import static productstore.ui.CartPage.PRODUCT_TO_ELIMINATE_LABEL;
import static productstore.ui.CartPage.TOTAL_LABEL;

public class RemoveFromCart extends UIInteractionSteps {

    Navigator navigate;

    @Step
    public void toCartPage() {
        navigate.toCartPage();
    }

    @Step("")
    public void removeFromCart() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(2));
        String xpathMessageConfirm = "/html/body/div[6]/div/div[1]/div/table/tbody/tr[3]/td[4]/a";
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathMessageConfirm)));
        find(PRODUCT_TO_ELIMINATE_LABEL).click();
    }

    @Step("Gets the total amount to pay")
    public String getTotalToPay(){
        String total;
        total = find(TOTAL_LABEL).getText();
        return total;
    }

}
