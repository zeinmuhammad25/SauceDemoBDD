package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    public WebDriver driver = Hooks.driver;
    LoginPage loginPage = new LoginPage(driver);
    @When("User input {string} as userName and input {string} as password")
    public void inputCredential(String userName, String password){
        loginPage.setUserName(userName);
        loginPage.setPassword(password);
        loginPage.clickLogin();
    }

    @Given("User already on login page")
    public void verifyLoginPage(){
        Assert.assertTrue(loginPage.verifyLoginPage());
    }

    @Then("User already on product page")
    public void verifyDashboard(){
        Assert.assertTrue(loginPage.verifyDshboard());
    }

    @Then("User see {string} as error text on login page")
    public  void verifyErrorText(String A){
        Assert.assertEquals( A , loginPage.textError());
    }

}
