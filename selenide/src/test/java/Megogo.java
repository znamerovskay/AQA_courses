import helpers.BaseHelper;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InputPage;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.getFocusedElement;
import static com.codeborne.selenide.Selenide.open;

public class Megogo extends BaseTest{

    MainPage mainPage = new MainPage();
    InputPage inputPage = new InputPage();
    BaseHelper baseHelper = new BaseHelper();

    @Test
    public void TryTariffFor29(){
    mainPage.clickOnTryButton();
    baseHelper.waitSec();
    inputPage.openInputPage();
        Assert.assertTrue(getFocusedElement().isDisplayed());
    }
}
