package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.CartPage;
import org.openqa.selenium.WebDriver;

public class CartSteps {

    private final WebDriver driver = Hooks.driver;
    HomePage homePage = new HomePage(driver);

    @When("User filter list  product by {string}")
    public void selectFilterProduct(String filterProduct) throws InterruptedException {
        homePage.selectFilterProduct(filterProduct);
        Thread.sleep(5000);
    }
}
