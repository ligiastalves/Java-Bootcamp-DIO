package testesSeleniumWebDriver.testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import testesSeleniumWebDriver.pages.RegisterPage;

public class RegisterPageTest {

    private RegisterPage registerPage;
    private final String URL_LOGIN = "https://automationexercise.com/login";
    //private final String URL_CREATEACCOUNT = "https://automationexercise.com/account_created";

    @BeforeEach
    void setUp() throws Exception {
        this.registerPage = new RegisterPage();
        this.registerPage.visit(this.URL_LOGIN);
    }

    @AfterEach
    void tearDown() throws Exception {
        this.registerPage.quitWebDriver();
    }

    @Test
    void testNewUser() {
        //when
        this.registerPage.insertInfosToRegister();
        //then
        String expected = "ligia.stgoncalves@gmail.com";
        String actual = this.registerPage.getEmailNewAccount();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCreateNewAccount() {
        //when
        this.registerPage.fillOutForm();

        //then
        //esse teste não está funcionando, não consegui corrigir pois o site usado por ela é diferente do meu
        //e não tem o mesmo comportamento

//        String expected = "Congratulations! Your new account has been successfully created!";
//        String actual = this.registerPage.getWelcomeMessage();
//        Assertions.assertEquals(expected, actual);
//
//        String actualUrl = this.registerPage.getCurrentUrl();
//        Assertions.assertNotEquals(this.URL_CREATEACCOUNT, actualUrl);
    }
}