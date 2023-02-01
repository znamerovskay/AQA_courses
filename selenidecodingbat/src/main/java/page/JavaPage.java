package page;

import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class JavaPage {

    private WebElement pyhtonButton = $x("//*[text() = 'Python']");


        public void clickOnPyhtonButton(){
            pyhtonButton.click();
        }
}