package testesSeleniumWebDriver.pages;

import org.openqa.selenium.By;

public class DressesPage extends BasePage {
    //Locators
    private By menuDressesLocator = By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a");
    private By submenuDressesLocator = By.xpath("//*[@id=\"Women\"]/div/ul/li[1]/a");
    private By titlePageDressesLocator = By.xpath("/html/body/section/div/div[2]/div[1]/div/h2");

    public void viewCasualDressesPage(){
        if(super.isDisplayed(menuDressesLocator)){
            super.actionMoveToElementPerform(menuDressesLocator);
            super.actionMoveToElementClickPerform(submenuDressesLocator);
        }else{
            System.out.println("Menu dresses was not found");
        }
    }

    public String getTitlePage(){
        return super.getText(titlePageDressesLocator);
    }

}
