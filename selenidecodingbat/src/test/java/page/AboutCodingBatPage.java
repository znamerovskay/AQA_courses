package page;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$x;

public class AboutCodingBatPage {

    private WebElement aboutCodingBat = $x("//h2[text() ='About CodingBat']").shouldBe(Condition.visible);

    public void aboutCod(){
        aboutCodingBat.isDisplayed();
    }
}
