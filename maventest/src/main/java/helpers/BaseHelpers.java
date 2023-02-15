package helpers;

import org.openqa.selenium.WebDriver;
import page.BasePage;

import java.time.Duration;

public class BaseHelpers {
 WebDriver driver;

    public BaseHelpers(WebDriver driver) {
        this.driver = driver;
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

    public void waitSec() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
}
