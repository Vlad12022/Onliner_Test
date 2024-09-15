package by.onliner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.Task1.XpathConstants.SUBCATEGORIES_XPATH;

import java.time.Duration;
import java.util.*;


public class CatalogPage extends BaseSeleniumPage {


    @FindBy(xpath = "//li[contains(@class,'catalog')]")
    private List<WebElement> categories;

    public CatalogPage() {
        PageFactory.initElements(driver, this);
    }

    public Map<String, List<String>> checkWidget(String categoryName, String categoryXPath) {

        Map<String, List<String>> widgetTexts = new HashMap<>();
        WebElement category = driver.findElement(By.xpath(categoryXPath));
        String categoryText = category.getText();
        category.click();

        List<WebElement> subCategories = category.findElements(By.xpath(SUBCATEGORIES_XPATH));
        List<String> subCategoriesTexts = new ArrayList<>();
        for (WebElement subCategory : subCategories) {
            try {
                subCategory.click();
                List<WebElement> subSubCategories = subCategory.findElements(By.tagName("a"));
                subSubCategories.stream()
                        .map(WebElement::getText)
                        .forEach(subCategoriesTexts::add);
            } catch (Exception e) {
                System.out.println("Произошла ошибка: " + e.getMessage());
            }
        }
        widgetTexts.put(categoryText, subCategoriesTexts);
        return widgetTexts;
    }
}








