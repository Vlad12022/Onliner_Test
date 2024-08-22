import io.github.bonigarcia.wdm.WebDriverManager;
import org.onliner.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OnlinerTest {

    private WebDriver driver;
    private MainPage mainPage;
    private CatalogPage catalogPage;
    private CartPage cartPage;
    private NewsPage newsPage;
    private ElectronicsPage electronicsPage;
    private ComputersPage computersPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        mainPage = new MainPage(driver);
        catalogPage = new CatalogPage(driver);
        cartPage = new CartPage(driver);
        newsPage = new NewsPage(driver);
        electronicsPage = new ElectronicsPage(driver);
        computersPage = new ComputersPage(driver);
    }

    @Test(priority = 1)
    public void testOpenMainPage() {
        mainPage.open();
    }

    @Test(priority = 4)
    public void testOpenCatalogPage() {
        catalogPage.open();

    }

    @Test(priority = 3)
    public void testOpenCartPage() {
        cartPage.open();

    }

    @Test(priority = 2)
    public void testOpenNewsPage() {
        newsPage.open();

    }

    @Test(priority = 5)
    public void testOpenElectronicsPage() {
        electronicsPage.open();

    }

    @Test(priority = 6)
    public void testOpenComputersPage() {
        computersPage.open();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}