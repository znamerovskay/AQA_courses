package page;

import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class PyhtonPage {

    private final WebElement javaButton = $("//*[text() = 'Java']");
    private final WebElement firstTask= $("//*[text() = 'Warmup-1']");


    public void clickOnJavaButton(){
        javaButton.click();
    }

    public void firstTaskVisible(){
        firstTask.isDisplayed();
    }
}
