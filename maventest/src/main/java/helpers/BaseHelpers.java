package helpers;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

/**
 * Class BaseHelpers
 *
 * @author Irina.Znamerovskay
 * @data 16.02.2023
 */
public class BaseHelpers {
 WebDriver driver;

    public BaseHelpers(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Refresh Page
     */
    public void refreshPage() {
        driver.navigate().refresh();
    }

    /**
     * Implicitly Wait for Page
     */
    public void waitSec() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public void close(){
    }

}
