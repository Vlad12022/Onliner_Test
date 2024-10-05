package pages;

import utils.CatalogNames;
import utils.XpathConstants;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import static utils.XpathConstants.CATALOG_SUBCATEGORIES_XPATH;
import java.util.*;


@Slf4j
public class CatalogPage extends BaseSeleniumPage {

    @FindBy(xpath = "//a[@id='submit-button']")
    private WebElement accessCookieButton;

    public CatalogPage() {
        PageFactory.initElements(driver, this);
    }

    @SneakyThrows
    public Map<String, List<String>> checkCategoryDetails(String categoryXPath) {

        Map<String, List<String>> widgetText = new HashMap<>();
        WebElement category = driver.findElement(By.xpath(categoryXPath));
        String categoryText = category.getText();
        category.click();

        List<WebElement> subCategories = category.findElements(By.xpath(CATALOG_SUBCATEGORIES_XPATH));
        List<String> subCategoriesTexts = new ArrayList<>();
        for (WebElement subCategory : subCategories) {
            try {
                subCategory.click();
                List<WebElement> subSubCategories = subCategory.findElements(By.tagName("a"));
                subSubCategories.stream()
                        .map(WebElement::getText)
                        .forEach(subCategoriesTexts::add);
            } catch (Exception e) {
                log.error("Произошла ошибка" + e.getMessage());
            }
        }
        widgetText.put(categoryText, subCategoriesTexts);
        return widgetText;
    }
   public String getCategoryXpath(CatalogNames catalogName){
        return String.format(XpathConstants.CATALOG_ALL_CATEGORIES_XPATH,catalogName.getIndex());
   }

}



