package org.Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.*;


public class CatalogPage extends BaseSeleniumPage {
    public static final String ID_CONTAINER_DIV_DIV_DIV_DIV_DIV_1_DIV_4_DIV_DIV_DIV_DIV_DIV = "//*[@id='container']/div/div/div/div/div[1]/div[4]/div/div/div/div/div";
    @FindBy(xpath = "//*[@id='container']/div/div/div/div/div[1]/ul/li")
    private List<WebElement> categories;

    public CatalogPage() {
        PageFactory.initElements(driver, this);
    }

    public Map<String, Set<String>> checkWidget(String categoryName, String categoryXPath) {


        Map<String, Set<String>> widgetTexts = new HashMap<>();
        WebElement category = driver.findElement(By.xpath(categoryXPath));
        String categoryText = category.getText();
        Set<String> subCategoriesTexts = new LinkedHashSet<>();


        category.click();
        List<WebElement> subCategories = category.findElements(By.xpath(ID_CONTAINER_DIV_DIV_DIV_DIV_DIV_1_DIV_4_DIV_DIV_DIV_DIV_DIV));

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







