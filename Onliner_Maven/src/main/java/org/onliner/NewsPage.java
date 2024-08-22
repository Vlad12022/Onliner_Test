package org.onliner;

import org.openqa.selenium.WebDriver;

public class NewsPage extends MainPage {
    private String url = "https://people.onliner.by/";

    public NewsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open() {
        driver.get(url);
    }
}





