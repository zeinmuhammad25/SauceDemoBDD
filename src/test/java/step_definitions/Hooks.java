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
    public void openBrowser() throws InterruptedException {
        ChromeOptions co = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        co.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(co);
        String URL = "https://www.saucedemo.com/";
        driver.get(URL);
        driver.manage().window().maximize();

    }

    @After
    public void closeBrowser() throws InterruptedException {
        driver.quit();
    }


}
