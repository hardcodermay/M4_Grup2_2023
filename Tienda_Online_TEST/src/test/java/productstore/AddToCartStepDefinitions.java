package productstore;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import productstore.actions.addtocart.AddToCart;
import productstore.actions.addtocart.AddToCartActionResults;
import productstore.actions.login.Login;
import productstore.actions.login.LoginActionResults;
import productstore.actions.navigate.Navigator;

import static org.assertj.core.api.Assertions.assertThat;

public class AddToCartStepDefinitions {
    @Managed
    WebDriver driver;
    @Steps
    Navigator navigate;
    @Steps
    AddToCart adder;

    @Steps
    AddToCartActionResults results;

    @Given("Francisco wants to add three products to the cart")
    public void francisco_wants_to_add_three_products_to_the_cart() {
        driver.manage().window().maximize();
        navigate.toLandingPage();
    }
    @When("Francisco clicks over the category and select one by one the products")
    public void francisco_clicks_over_the_category_and_select_one_by_one_the_products() {
        adder.addOneProductToCart(0,0);

    }

    @Then("Francisco navigates to the cart page and verify that the three products are there")
    public void francisco_navigates_to_the_cart_page_and_verify_that_the_three_products_are_there() {

        assertThat(results.getClickedProduct()).isEqualTo("Product added");
    }
}
