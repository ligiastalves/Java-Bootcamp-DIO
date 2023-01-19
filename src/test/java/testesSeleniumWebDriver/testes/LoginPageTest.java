package testesSeleniumWebDriver.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testesSeleniumWebDriver.pages.LoginPage;

public class LoginPageTest {

    private LoginPage loginPage;
    private final String URL = "https://automationexercise.com/login";

    @BeforeEach
    void setUp() throws Exception {
        this.loginPage = new LoginPage();
        this.loginPage.visit(this.URL);
    }
    @AfterEach
    void tearDown() throws Exception {
        this.loginPage.quitWebDriver();
    }

    @Test
    void test(){
       //when
        this.loginPage.signIn();
        //then
        assertEquals("CATEGORY", this.loginPage.getTagCategory());
        assertNotEquals(this.loginPage.getCurrentUrl(), this.URL);
    }
}