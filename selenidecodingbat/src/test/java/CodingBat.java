import org.testng.Assert;
import org.testng.annotations.Test;
import page.*;

public class CodingBat extends BaseTest {

    JavaPage javaPage = new JavaPage();
    PyhtonPage pyhtonPage = new PyhtonPage();
    BasePage basePage = new BasePage();

    @Test
    public void goToPagePyhton() {
        javaPage.clickOnPyhtonButton();
        Assert.assertTrue(pyhtonPage.isVisibleWarmup1());
    }
    @Test
    public void viewHint(){
        javaPage.clickOnPyhtonButton();
        pyhtonPage.isVisibleWarmup1();
        Assert.assertTrue(pyhtonPage.isVisibleSolution());
    }
    @Test
    public void aboutCodingBat(){
        basePage.clickOnAboutButton();
        new AboutCodingBatPage().aboutCod();
    }
    @Test
    public void  logIn(){
        basePage.logInAccount();
        Assert.assertTrue(basePage.isVisibleLogOut());
    }
    @Test
        public void logOut(){
        basePage.logInAccount();
        basePage.isVisibleLogOut();
        basePage.clickOnLogOut();
        Assert.assertTrue(basePage.isVisibleLogIn());
    }
}
