package org.onliner;


import org.openqa.selenium.WebDriver;

public class MainPage {
    protected WebDriver driver;
    private String url = "https://www.onliner.by/";

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(url);
    }

}