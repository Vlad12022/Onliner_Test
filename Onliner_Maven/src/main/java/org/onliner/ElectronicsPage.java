package org.onliner;

import org.openqa.selenium.WebDriver;

public class ElectronicsPage extends CatalogPage {

    private String url = "https://catalog.onliner.by/mobile?region=gomel";

    public ElectronicsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open() {
        driver.get(url);
    }
}
