package productstore;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import productstore.actions.addtocart.AddToCart;
import productstore.actions.addtocart.AddToCartActionResults;
import productstore.actions.removefromcart.RemoveFromCart;
import productstore.actions.removefromcart.RemoveFromCartActionResults;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveFromCartStepDefinitions {
    String originalTotal = "";
    @Managed
    WebDriver driver;

    @Steps
    AddToCart adder;

    @Steps
    RemoveFromCart remover;

    @Steps
    AddToCartActionResults results;

    @Steps
    RemoveFromCartActionResults loggedProductresults;

    @Given("Francisco has already items on the cart and wants to remove one products")
    public void francisco_has_already_items_on_the_cart_and_wants_to_remove_one_products() {
        driver.manage().window().maximize();
        adder.toLandingPage();
        adder.addOneProductToCart(0,0);
        adder.addOneProductToCart(0,1);
        adder.addOneProductToCart(1,2);
        adder.toLandingPage();
    }
    @When("Francisco navigates to the cart page and remove one product")
    public void francisco_navigates_to_the_cart_page_and_remove_one_product() {
        remover.toCartPage();
        remover.removeFromCart();
        originalTotal = remover.getTotalToPay();
    }
    @Then("Francisco verify that the {string} is successfully removed")
    public void francisco_verify_that_the_product_is_successfully_removed(String result) {
        assertThat(loggedProductresults.verifyProductResults(result)).isNotEqualTo(originalTotal);
    }

}
