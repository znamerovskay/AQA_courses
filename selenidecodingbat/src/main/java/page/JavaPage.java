package page;

import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class JavaPage {

    private final WebElement pyhtonButton = $("//*[text() = 'Python']");


        public void clickOnPyhtonButton(){
            pyhtonButton.click();
        }
}