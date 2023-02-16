package page;

import org.openqa.selenium.By;

/**
 * Class BasePage
 *
 * @author Irina.Znamerovskay
 * @data 16.02.2023
 */
public class LoginPage extends BasePage{

    private By phoneButton = By.xpath("//*[@id=\"login-by-phone\"]/div/input");
    private By passwordButton = By.xpath("//*[@type = 'password']");
    private By entranceButton = By.xpath("//*[@class = 'form-group']//input[1][@class = 'pull-right']");
    private By successfulLoginButton = By.xpath("/html/body/div[4]");
    private By basketButton = By.xpath("//*[@id = 'button-cart']");
    private By logoButton = By.xpath("//*[@class = 'logo']");
    private By backToTheMainField = By.xpath(" //*[text() = 'Каталог підбору запчастин']");


    public void enterNumberAndPassword() {
        driver.findElement(phoneButton).click();
        driver.findElement(phoneButton).sendKeys("0959418508");
        driver.findElement(passwordButton).click();
        driver.findElement(passwordButton).sendKeys("znamerovskay17");
    }

    /**
     * Click on Entrance button
     */
    public void clickOnEntranceButton() {
        driver.findElement(entranceButton).click();
    }

    /**
     * @return Displays successful logins
     */
    public boolean isDisplaydSuccessReg() {
        return driver.findElement(successfulLoginButton).isDisplayed();
    }

    /**
     * Click on Basket button
     */
    public void clickOnBasketButton() {
        driver.findElement(basketButton).click();
    }

    /**
     * Click on Logo Button
     */
    public void clickOnLogoButton() {
        driver.findElement(logoButton).click();
    }

    /**
     * @return Displays a return to the main page
     */
    public boolean isDisplayedMainPage(){
        return  driver.findElement(backToTheMainField).isDisplayed();
    }
}
