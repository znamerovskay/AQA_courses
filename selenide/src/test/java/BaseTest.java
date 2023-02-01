import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

abstract public class BaseTest {

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "CHROME";
        Configuration.driverManagerEnabled = true;
        Configuration.headless = false;
        Configuration.timeout = 4000;
    }

    @BeforeMethod
    public void init(){
        setUp();
        open("https://megogo.net/ua/tv/channels/1420191-stb-hd-online.html");
    }

    @AfterMethod
        public void tearDown(){
        Selenide.clearBrowserCookies();
        Selenide.closeWebDriver();
    }
}
