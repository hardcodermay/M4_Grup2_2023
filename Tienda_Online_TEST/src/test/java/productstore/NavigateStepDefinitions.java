package productstore;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import productstore.actions.navigate.NavigateActionResults;
import productstore.actions.navigate.Navigator;

import static org.assertj.core.api.Assertions.assertThat;

public class NavigateStepDefinitions {
    @Managed
    WebDriver driver;
    private final String[] items = {"Phones", "Laptops", "Monitors"};
    private final int[] cats = {0, 1, 2};
    @Steps
    Navigator navigate;

    @Steps
    NavigateActionResults navRes;

    @Given("Francisco wants to check every category")
    public void franciscoWantsToCheckEveryCategory() {
        driver.manage().window().maximize();
        navigate.toLandingPage();
    }

    @When("Francisco clicks on every category one by one to see the products")
    public void franciscoClicksEveryCategoryOneByOneToSeeTheProducts() {
        for(int cat: cats) {
            navigate.clickOneCategory(cat);
        }
    }

    @Then("he can check the stock and see the first product")
    public void heCanCheckTheStock() {
        WebElement[] visited = navigate.getvisitedCategories();
        for(int cat: cats) {
            assertThat(navRes.getWebElementText(visited[cat])).isEqualTo(items[cat]);
        }
    }
}
