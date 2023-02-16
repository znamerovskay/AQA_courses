import dataproviders.SparesData;
import helpers.BaseHelpers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import page.*;
import utils.PropertiesFactory;
import utils.WebDriverFactory;

import static utils.WebDriverFactory.DEFAULT_CHROME;
import static utils.WebDriverFactory.getDriver;

/**
 * Class Base Test
 *
 * @author Irina.Znamerovskay
 * @data 16.02.2023
 */
public abstract class BaseTest {

    WebDriver driver;

    BasePage basePage = new BasePage();
    BaseHelpers baseHelpers = new BaseHelpers(DEFAULT_CHROME);
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    BasketPage basketPage = new BasketPage();
    CatalogAudiSparesPage catalogAudi = new CatalogAudiSparesPage();

    /**
     * BeforeClass SetUp
     */
    @BeforeClass(alwaysRun = true)
    public void setUp() {
        driver = getDriver("DEFAULT_CHROME");
        driver.get(PropertiesFactory.getUrl("url"));
        BasePage.setDriver(driver);
    }

    /**
     * AfterClass TearDown
     */
    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}
