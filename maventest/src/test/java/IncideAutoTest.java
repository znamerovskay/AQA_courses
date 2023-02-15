import dataproviders.SparesData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IncideAutoTest extends BaseTest{

    @Test(dataProviderClass = SparesData.class, dataProvider = "sparesData")
    public void searchDetail(final String spares){
        mainPage.clickOnSearchFieldAndEnterData(spares);
        mainPage.clickButton();
        Assert.assertTrue(mainPage.isDisplaydesSortingButton());
        mainPage.clearSearchField();
    }

    @Test
    public void entranceToTheOffice() {
        mainPage.clickOnEntrancetButton();
        baseHelpers.waitSec();
        loginPage.enterNumberAndPassword();
        loginPage.clickOnEntrace();
        Assert.assertTrue(loginPage.isDisplaydSuccessReg());
    }

    
}
