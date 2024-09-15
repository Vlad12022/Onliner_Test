package by.onliner;

import org.testng.annotations.Test;

import java.util.*;


public class MainTest extends BaseTest {

    @Test(dataProvider = "categoryProvider", dataProviderClass = TestDataProvider.class)
    public void testCheckWidget(String categoryName , String categoryXPath) {
        //Given
        MainPage mainPage = new MainPage();
        CatalogPage catalogPage = mainPage.openCatalog();

        //When
        Map<String, Set<String>> widgetTexts = catalogPage.checkWidget( categoryName,categoryXPath);

        //Then
        widgetTexts.forEach((category, subCategories) -> {
            System.out.println("Category: " + category);
            subCategories.forEach(subCategory -> System.out.println(" - " + subCategory));
        });

    }
}


