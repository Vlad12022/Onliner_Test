package org.onliner;

import org.openqa.selenium.WebDriver;

public class ComputersPage extends CatalogPage {

    private String url = "https://catalog.onliner.by/desktoppc?region=gomel";

    public ComputersPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open() {
        driver.get(url);
    }

}
