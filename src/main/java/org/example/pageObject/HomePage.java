package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPage {

  public static WebDriver webDriver;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        webDriver = driver;
    }
    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement filterProduct;

    public void selectFilterProduct(String fltrProduct){
        Select filter = new Select(filterProduct);
        filter.selectByVisibleText(fltrProduct);
    }
}
