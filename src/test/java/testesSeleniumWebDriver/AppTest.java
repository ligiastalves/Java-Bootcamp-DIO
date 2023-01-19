package testesSeleniumWebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

    private WebDriver driver;

    @Test
    public void helloSelenium(){
        System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");

        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://automationexercise.com/";

        Assertions.assertEquals(expectedUrl, currentUrl);

        //driver.quit();
    }
}