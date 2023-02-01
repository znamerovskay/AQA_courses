package helpers;

import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class BaseHelper {
    WebDriver driver;

    public void waitSec() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    }
}
