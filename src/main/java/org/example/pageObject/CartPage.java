package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPage {

    public static WebDriver webDriver;

    public CartPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        webDriver = driver;
    }

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectFilter;

    public void selectProductFilter(String sort){
        Select a = new Select(selectFilter);
        a.selectByVisibleText(sort);
    }


    public void pickProduct(String namaProduct){
        webDriver.findElement(By.xpath("//div[text()='"+ namaProduct +"']//ancestor::div[@class='inventory_item']/div[2]/div[2]/button")).click();
    }
}
