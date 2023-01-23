package productstore;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import productstore.actions.navigate.Navigator;
import productstore.actions.payorder.PayOrder;
import productstore.actions.payorder.PayOrderActionResults;

import static org.assertj.core.api.Assertions.assertThat;

public class PayOrderStepDefinitions {

    private static final String MESSAGE = "";
    @Managed
    WebDriver driver;
    @Steps
    Navigator navigator;

    @Steps
    PayOrder payeur;

    @Steps
    PayOrderActionResults paymentDone;

    @Given("Francisco navigates to his cart")
    public void franciscoNavigatesToHisCart() {
        driver.manage().window().maximize();
        navigator.toLandingPage();
        navigator.toCartPage();
    }

    @When("Francisco reviews his order")
    public void franciscoReviewsHisOrder() {
        payeur.fillPaymentForm();
    }

    @Then("Finally Francisco confirms his order and pays")
    public void finallyFranciscoConfirmsHisOrderAndPays() {
        assertThat(paymentDone.getPaymentConfirmation()).isEqualTo(MESSAGE);
    }
}