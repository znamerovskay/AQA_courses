package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WebDriverFactory {

    public static final WebDriver DEFAULT_CHROME = new ChromeDriver();

    public static WebDriver getDriver(String name){
        WebDriver driver = null;
        if("CHROME".equalsIgnoreCase(name)){
            driver = new ChromeDriver();
        } else if("FIREFOX".equalsIgnoreCase(name)){
            driver = new FirefoxDriver();
        }else{
            driver = DEFAULT_CHROME;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver;
    }
}
