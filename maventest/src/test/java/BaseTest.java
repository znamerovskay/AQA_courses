import dataproviders.SparesData;
import helpers.BaseHelpers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import page.BasePage;
import page.LoginPage;
import page.MainPage;
import utils.PropertiesFactory;
import utils.WebDriverFactory;

import static utils.WebDriverFactory.DEFAULT_CHROME;
import static utils.WebDriverFactory.getDriver;

/**
 * Class Base Test
 * @author Irina.Znamerovskay
 * @data 05.02.2023
 */
public abstract class BaseTest {

    WebDriver driver;

    BasePage basePage = new BasePage();
    BaseHelpers baseHelpers = new BaseHelpers(DEFAULT_CHROME);
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();

    @BeforeClass(alwaysRun = true)
    public void setUp(){
        driver = getDriver("DEFAULT_CHROME");
        driver.get(PropertiesFactory.getUrl("url"));
        BasePage.setDriver(driver);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
}
