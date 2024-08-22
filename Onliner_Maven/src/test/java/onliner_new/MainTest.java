package onliner_new;

import onliner_new.BaseSeleniumTest;
import org.Onliner_New_Test.MainPage;

import org.testng.annotations.Test;

public class MainTest extends BaseSeleniumTest {
    private static final String login = "vladarinushkin@gmail.com";
    private static final String password = "Vladoslol7";

    @Test
    public void check() {
        MainPage mainPage = new MainPage();
        pause(2000);
        mainPage.login().auth(login, password);
        pause(2000);
        mainPage.open().clickSomeonePage();
        pause(2000);

    }


}
