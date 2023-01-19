package testesSeleniumWebDriver.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    //Locators
    private By emailAddressLocator = By.name("email");
    private By passwordLocator = By.name("password");
    private By submitBtnLocator = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
    private By tagCategory = By.xpath("/html/body/section[2]/div/div/div[1]/div/h2");

    public void signIn() {
        if (super.isDisplayed(emailAddressLocator)) {
            super.type("lga.hiphop@gmail.com", emailAddressLocator);
            super.type("123456@Li", passwordLocator);
            super.click(submitBtnLocator);
        } else {
            System.out.println("email textbox was not present");
        }
    }

    public String getTagCategory() {
        return super.getText(tagCategory);
    }
}
