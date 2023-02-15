package page;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public static void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }
    protected static WebDriver driver;
}
