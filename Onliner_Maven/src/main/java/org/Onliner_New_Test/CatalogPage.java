package org.Onliner_New_Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogPage extends BaseSeleniumPage {

    @FindBy(xpath = "//*[@id='container']/div/div/div/div/div[1]/ul/li[2]/span[1]")
    WebElement electronicCatalog;

    @FindBy(xpath = "//*[@id='container']/div/div/div/div/div[1]/div[4]/div/div/div/div/div[2]/div[1]")
    WebElement tvCatalog;

    public CatalogPage() {
        PageFactory.initElements(driver, this);
    }

    public CatalogPage clickSomeonePage() {
        electronicCatalog.click();
        tvCatalog.click();
        return this;
    }


}
