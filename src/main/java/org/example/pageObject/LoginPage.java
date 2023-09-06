package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver webDriver;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

      //inisiasi locator
    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement userName;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;
    @FindBy(id = "login-button")
    private WebElement buttonLogin;
    @FindBy(xpath = "//span[@class='title']")
    private WebElement labelProduct;
    @FindBy(xpath = "//h3")
    private WebElement labelErrorText;

    //setup method
    public void setUserName(String usrName){
        userName.sendKeys(usrName);
    }
    public void setPassword(String psword){
        password.sendKeys(psword);
    }
    public void clickButtonLogin(){
        buttonLogin.click();
    }
    public boolean userNameDisplayed(){
        return userName.isDisplayed();
    }
    public boolean verifyLabelProduct(){
        return labelProduct.isDisplayed();
    }
    public String getLabelErrorText(){
        return labelErrorText.getText();
    }

}
