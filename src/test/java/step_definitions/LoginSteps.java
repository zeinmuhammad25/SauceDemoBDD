package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {

    private final WebDriver driver = Hooks.driver;
    LoginPage loginPage = new LoginPage(driver);
    //final method
    @When("User input {string} as a userName {string} as a password")
    public void inputCredential(String usrName, String pswd) throws InterruptedException {
        loginPage.setUserName(usrName);
        loginPage.setPassword(pswd);
        loginPage.clickButtonLogin();
        Thread.sleep(5000);
    }
    @Given("User open the website sauce demo")
    public void verifyLoginPage(){
        Assert.assertTrue(loginPage.userNameDisplayed());
    }
    @Then("User already on home page")
    public void verifyHomePage(){
        Assert.assertTrue(loginPage.verifyLabelProduct());
    }

    @Then("User see error {string} on login page")
    public void verifyLabelErrorText(String errorText) throws InterruptedException {
        Assert.assertEquals(loginPage.getLabelErrorText(),errorText);
        Thread.sleep(3000);
    }

}
