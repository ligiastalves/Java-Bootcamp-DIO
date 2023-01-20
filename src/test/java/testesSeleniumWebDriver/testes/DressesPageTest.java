package testesSeleniumWebDriver.testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testesSeleniumWebDriver.pages.DressesPage;
//esse teste vai falhar pois o site que a professora usou não está mais disponivel,
// e o site que eu usei não tem a mesma funcionalidade do dela
public class DressesPageTest {

    private DressesPage dressesPage;
    private final String URL = "https://automationexercise.com/products";

    @BeforeEach
    void setUp() throws Exception {
        this.dressesPage = new DressesPage();
        this.dressesPage.visit(this.URL);
    }

    @AfterEach
    void tearDown() throws Exception {
        //this.dressesPage.quitWebDriver();
    }

    @Test
    void test() {
        //when
        this.dressesPage.viewCasualDressesPage();
        //then
        Assertions.assertEquals("CATEGORY", this.dressesPage.getTitlePage());
        Assertions.assertNotEquals(this.URL, dressesPage.getCurrentUrl());
    }
}
