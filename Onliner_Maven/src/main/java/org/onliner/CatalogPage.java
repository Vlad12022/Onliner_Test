package org.onliner;


import org.openqa.selenium.WebDriver;


public class CatalogPage {
    protected WebDriver driver;
    private String url = "https://catalog.onliner.by/";

    public CatalogPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(url);
    }


}
