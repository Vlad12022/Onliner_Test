package org.Onliner_New_Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseSeleniumPage {

    @FindBy(xpath = "//*[@id='container']/div/div/header/div[2]/div/nav/ul[1]/li[1]/a[2]")
    private WebElement catalog;
    @FindBy(xpath = "//*[@id='userbar']/div[1]/div/div/div[1]")
    private WebElement loginButton;


    public MainPage() {
        driver.get("https://www.onliner.by/");
        PageFactory.initElements(driver, this);
    }

    public LoginPage login() {
        loginButton.click();
        return new LoginPage();
    }

    public CatalogPage open() {
        catalog.click();
        return new CatalogPage();
    }
}
