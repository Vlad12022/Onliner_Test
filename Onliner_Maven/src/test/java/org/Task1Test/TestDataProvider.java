package org.Task1Test;


public class TestDataProvider {

    @org.testng.annotations.DataProvider(name = "categoryProvider")
    public static Object[][] categoryProvider() {
        return new Object[][]{
                {"�����������", "//*[@id='container']/div/div/div/div/div[1]/ul/li[2]"},
                {"���������� � ����", "//*[@id='container']/div/div/div/div/div[1]/ul/li[3]"}
        };
    }
}








