package tests;


import utils.CatalogNames;
import pages.CatalogPage;
import pages.MainPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.util.*;


public class CatalogCategoryTest extends BaseTest {

    @DataProvider(name = "categoryProvider")
    public static Object[][] categoryProvider() {
        return new Object[][]{
                {CatalogNames.ELECTRONICS },

        };
    }

    @Test(dataProvider = "categoryProvider")

    public void testCheckCategoryDetails(CatalogNames catalogName) {

        //Given
        MainPage mainPage = new MainPage();
        CatalogPage catalogPage = mainPage.openCatalog();


        //When
        String categoryXPath = catalogPage.getCategoryXpath(catalogName);
        Map<String, List<String>> widgetTexts = catalogPage.checkCategoryDetails(categoryXPath);

        //Then
        widgetTexts.forEach((category, subCategories) -> {
            System.out.println("Category: " + category);
            subCategories.forEach(subCategory -> System.out.println(" - " + subCategory));

            //Set<String> uniqueSubCategories = new LinkedHashSet<>(subCategories);
            //Assert.assertEquals(uniqueSubCategories.size(),subCategories.size(),"В списке есть дубликаты");

        });
    }
}


