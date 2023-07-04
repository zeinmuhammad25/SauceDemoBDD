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

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement btnLogin;

    @FindBy(xpath = "//span[@class='title']")
    private WebElement verifyDashboard;

    @FindBy(css = "h3")
    private WebElement errorText;

    public String textError(){
        return errorText.getText();
    }


    public boolean verifyDshboard(){
        return verifyDashboard.isDisplayed();
    }

    public void setUserName(String urName){
        userName.sendKeys(urName);
    }

    public void setPassword(String psswrd){
        password.sendKeys(psswrd);
    }

    public void clickLogin(){
        btnLogin.click();
    }

    public boolean verifyLoginPage(){
        return userName.isDisplayed();
    }



}
