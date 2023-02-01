package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

/**
 * Глфвная страница сайта Megogo
 */
public class MainPage {

    private final SelenideElement tryButton = $("//*[@class = 'stub-action']");


    public void clickOnTryButton() {
        tryButton.click();
    }
}
