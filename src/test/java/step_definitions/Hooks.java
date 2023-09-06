package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void openBrowser(){
        //WebDriverManager.chromedriver().clearDriverCache().setup();
        //fungsi untuk setup chrome agar bisa terbuka
        WebDriverManager.chromedriver().setup();
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        //inisiasi library selenium
        driver = new ChromeDriver(co);

        String appUrl = "https://www.saucedemo.com/";
        driver.get(appUrl);//fungsi untuk ngebuka link html
        driver.manage().window().maximize();//fungsi untuk memaximize browser
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
