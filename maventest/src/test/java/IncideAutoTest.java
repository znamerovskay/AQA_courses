import dataproviders.SparesData;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * IncideAuto Test
 *
 * @author Irina.Znamerovskay
 * @data 16.02.2023
 */
public class IncideAutoTest extends BaseTest {

    /**
     * Entrance to the account
     */
    @Test
    public void entranceToTheAccountTest() {
        mainPage.clickOnEntrancedButton();
        baseHelpers.waitSec();
        loginPage.enterNumberAndPassword();
        baseHelpers.waitSec();
        loginPage.clickOnEntranceButton();
        baseHelpers.waitSec();
        Assert.assertTrue(loginPage.isDisplaydSuccessReg());
    }

    /**
     * Search spares
     *
     * @param spares
     */
    @Test (dataProviderClass = SparesData.class, dataProvider = "sparesData")
    public void searchDetailTest(final String spares) {
        mainPage.clickOnSearchFieldAndEnterData(spares);
        baseHelpers.waitSec();
        mainPage.clickOnSearchButton();
        Assert.assertTrue(mainPage.isDisplayedSortingButton());
        mainPage.clearSearchField();
    }

    /**
     * Entrance to the office and check basket is empty
     */
    @Test
    public void entranceToTheAccountAndcheckBasketIsEmptyTest() {
        mainPage.clickOnEntrancedButton();
        baseHelpers.waitSec();
        loginPage.enterNumberAndPassword();
        loginPage.clickOnEntranceButton();
        baseHelpers.refreshPage();
        loginPage.clickOnBasketButton();
        Assert.assertTrue(basketPage.isDisplaedFieldBasketEmpty());
    }

    /**
     * Entrance to the office and go to the main page through logo
     */
    @Test
    public void entranceAndGoBackToTheMainPageTest() {
        mainPage.clickOnEntrancedButton();
        baseHelpers.waitSec();
        loginPage.enterNumberAndPassword();
        loginPage.clickOnEntranceButton();
        baseHelpers.refreshPage();
        loginPage.clickOnLogoButton();
        Assert.assertTrue(loginPage.isDisplayedMainPage());
    }

    /**
     * Detail check for Audi
     */
    @Test
    public void checkSparesForAudi() {
        mainPage.clickOnAudiButton();
        Assert.assertTrue(catalogAudi.isDisplayedSpares());
    }
}
