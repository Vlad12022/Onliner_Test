package org.Onliner_New_Test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseSeleniumPage {

    @FindBy(xpath = "//*[@id='auth-container']/div/div[2]/div/form/div[1]/div/div[2]/div/div/div/div/input")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id='auth-container']/div/div[2]/div/form/div[2]/div/div/div/div/input")
    private WebElement passwordField;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public MainPage auth(String login, String password) {
        loginField.sendKeys(login);
        passwordField.sendKeys(password, Keys.ENTER);
        return new MainPage();
    }


}
