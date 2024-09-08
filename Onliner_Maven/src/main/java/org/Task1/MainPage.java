package org.Task1;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseSeleniumPage {

    @FindBy(xpath = "//*[@id='container']/div/div/header/div[2]/div/nav/ul[1]/li[1]/a[2]")
    private WebElement catalog;

    public MainPage() {
        driver.get("https://www.onliner.by/");
        PageFactory.initElements(driver, this);
    }

    public CatalogPage openCatalog() {
        catalog.click();
        return new CatalogPage();
    }


}

