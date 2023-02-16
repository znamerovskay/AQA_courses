package page;

import helpers.BaseHelpers;
import org.openqa.selenium.WebDriver;

/**
 * Class BasePage
 *
 * @author Irina.Znamerovskay
 * @data 16.02.2023
 */
public class BasePage {

    /**
     * SetDriver
     * @param driver
     */
    public static void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

    protected static WebDriver driver;
}
