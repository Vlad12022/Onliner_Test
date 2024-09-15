package org.Task1Test;


public class TestDataProvider {

    @org.testng.annotations.DataProvider(name = "categoryProvider")
    public static Object[][] categoryProvider() {
        return new Object[][]{
                {"Электроника", "(//span[@class='catalog-navigation-classifier__item-icon'])[2]"},
                {"Компьютеры и сети", "(//span[@class='catalog-navigation-classifier__item-icon'])[3]"},
        };
    }
}








