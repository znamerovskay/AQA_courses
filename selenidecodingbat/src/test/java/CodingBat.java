import org.testng.Assert;
import org.testng.annotations.Test;
import page.JavaPage;
import page.PyhtonPage;

public class CodingBat extends BaseTest {

    JavaPage javaPage = new JavaPage();
    PyhtonPage pyhtonPage = new PyhtonPage();

    @Test
    public void goToPagePyhton() {
        javaPage.clickOnPyhtonButton();
        pyhtonPage.firstTaskVisible();
        Assert.assertTrue(true);
    }
}
