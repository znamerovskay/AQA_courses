package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static page.BasePage.driver;

public class LoginPage {

    private By phoneButton = By.xpath("//*[@id=\"login-by-phone\"]/div/input");
    private By passwordButton = By.xpath("//*[@type = 'password']");
    private By entranceButton = By.xpath("//*[@class = 'form-group']//input[1][@class = 'pull-right']");
    private By successfulLoginButton = By.xpath("/html/body/div[4]");

    private By exitButton = By.xpath("");

    public void enterNumberAndPassword(){
        driver.findElement(phoneButton).click();
        driver.findElement(phoneButton).sendKeys("0959418508");
        driver.findElement(passwordButton).click();
        driver.findElement(passwordButton).sendKeys("znamerovskay17");
    }
    public void clickOnEntrace(){
        driver.findElement(entranceButton).click();
    }
    public boolean isDisplaydSuccessReg(){
        return driver.findElement(successfulLoginButton).isDisplayed();
    }
}
