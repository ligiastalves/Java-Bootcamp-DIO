package testesSeleniumWebDriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage extends BasePage {
    //Locators NEW USER
    private By nameLocator = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]");
    private By emailAddressLocator = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
    private By emailLocator = By.xpath("//*[@id=\"email\"]");
    private By submitBtnLocator = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");

    private By additionalInformationLocator = By.xpath("//*[@id=\"form\"]/div/div/div/div/form/p[4]/label/span");
    //Locators YOUR PERSONAL INFORMATION
    private By firstNameLocator = By.xpath("//*[@id=\"first_name\"]");
    private By lastNameLocator = By.xpath("//*[@id=\"last_name\"]");
    private By genderFemaleLocator = By.xpath("//*[@id=\"form\"]/div/div/div/div/form/div[1]/div[2]/label");
    private By passwordLocator = By.xpath("//*[@id=\"password\"]");
    private By daysLocator = By.xpath("//*[@id=\"days\"]");
    private By monthsLocator = By.xpath("//*[@id=\"months\"]");
    private By yearsLocator = By.xpath("//*[@id=\"years\"]");
    private By newsletterLocator = By.xpath("//*[@id=\"form\"]/div/div/div/div/form/div[6]/label");
    private By receiveOffersLocator = By.xpath("//*[@id=\"form\"]/div/div/div/div/form/div[7]/label");
    //Locators YOUR ADDRESS
    private By companyLocator = By.id("company");
    private By address1Locator = By.id("address1");
    private By address2Locator = By.id("address2");
    private By cityLocator = By.id("city");
    private By stateLocator = By.id("state");
    private By postCodeLocator = By.id("zipcode");
    private By countryLocator = By.id("country");
    private By mobilePhoneLocator = By.id("mobile_number");
    private By createAccountBtnLocator = By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button");
    private By welcomeMessageLocator = By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");

    public void insertInfosToRegister() {
        if (super.isDisplayed(emailAddressLocator) && (super.isDisplayed(nameLocator))) {
            type("Ligia Santos", nameLocator);
            type("ligia.stgoncalves@gmail.com", emailAddressLocator);
            click(submitBtnLocator);
        } else {
            System.out.println("name and email textbox was not present");
        }
    }

    public String getEmailNewAccount() {
        super.waitVisibilityOfElementLocated(additionalInformationLocator);
        return super.getTextByAttribute(this.emailLocator, "value");
    }

    public void fillOutForm() {
        this.insertInfosToRegister();
        super.waitVisibilityOfElementLocated(additionalInformationLocator);
        if (isDisplayed(genderFemaleLocator)) {
            super.click(genderFemaleLocator);
            super.type("Ligia", firstNameLocator);
            super.type("Santos", lastNameLocator);
            super.type("12345@", passwordLocator);
            super.selectByValue(daysLocator, "27");
            super.selectByValue(monthsLocator, "11");
            super.selectByValue(yearsLocator, "1991");
            super.click(newsletterLocator);
            super.click(receiveOffersLocator);
            super.type("DIO", companyLocator);
            super.type("Street Name, 123", address1Locator);
            super.type("xxxxx", address2Locator);
            super.type("Recife", cityLocator);
            super.type("Sao Paulo", stateLocator);
            super.selectByValue(countryLocator, "Canada");
            super.type("12345", postCodeLocator);
            super.type("99999999", mobilePhoneLocator);
            super.click(createAccountBtnLocator);
        } else {
            System.out.println("message was not found.");
        }
    }

    public String getWelcomeMessage() {
        super.waitVisibilityOfElementLocated(welcomeMessageLocator);
        return super.getText(welcomeMessageLocator);
    }
}

