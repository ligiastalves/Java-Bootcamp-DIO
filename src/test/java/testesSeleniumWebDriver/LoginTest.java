package testesSeleniumWebDriver;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    private WebDriver driver;

    @BeforeEach
    void setUp() throws Exception {
        System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://automationexercise.com/login");
    }

    @AfterEach
    void tearDown() throws Exception {
        //driver.quit();
    }

    @Test
    void testLogin() {
        WebElement emailAddressLocator = driver.findElement(By.name("email"));

        emailAddressLocator.sendKeys("lga.hiphop@gmail.com");

        WebElement passwordElement = driver.findElement(By.name("password"));
        passwordElement.sendKeys("123456@Li");

        WebElement submitBtnElement = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
        submitBtnElement.click();

        WebElement tagCategory = driver.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/h2"));
        String textTagH2 = tagCategory.getText();

        assertEquals("CATEGORY", textTagH2);
    }
}