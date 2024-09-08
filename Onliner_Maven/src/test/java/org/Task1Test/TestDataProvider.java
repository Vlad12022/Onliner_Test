package org.Task1Test;


public class TestDataProvider {

    @org.testng.annotations.DataProvider(name = "categoryProvider")
    public static Object[][] categoryProvider() {
        return new Object[][]{
                {"Электроника", "//*[@id='container']/div/div/div/div/div[1]/ul/li[2]"},
                {"Компьютеры и сети", "//*[@id='container']/div/div/div/div/div[1]/ul/li[3]"}
        };
    }
}








