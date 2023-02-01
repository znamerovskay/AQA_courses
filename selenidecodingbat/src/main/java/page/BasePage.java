package page;

import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$x;

public class BasePage {

    private WebElement about = $x("//*[text() ='about']");
    private WebElement help = $x("//*[text() ='help']");
    private WebElement codeHelpAndVideo = $x("//*[text() ='code help+videos | ']");
    private WebElement done = $x("//*[text() ='done']");
    private WebElement pref = $x("//*[text() ='prefs']");

    private WebElement textBoxEmail = $x("//*[@type ='text']");
    private WebElement textBoxPassword = $x("//*[@type ='password']");
    private WebElement logInButton = $x("//*[@type ='submit']");
    private WebElement checkLogOut = $x("//*[text() = 'log out']");

    public void clickOnAboutButton(){
        about.click();
    }

    public void logInAccount(){
        textBoxEmail.click();
        textBoxEmail.sendKeys("znamerovskay1488@gmail.com");
        textBoxPassword.click();
        textBoxPassword.sendKeys("Znamerovskay88");
        logInButton.click();
    }
    public boolean isVisibleLogOut(){
        return checkLogOut.isDisplayed();
    }
    public void clickOnLogOut(){
        checkLogOut.click();
    }
    public boolean isVisibleLogIn(){
        return logInButton.isDisplayed();
    }

}
