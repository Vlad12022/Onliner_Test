package org.onliner;

import org.openqa.selenium.WebDriver;

public class CartPage extends MainPage {
    private String url = "https://cart.onliner.by/";

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open() {
        driver.get(url);
    }
}