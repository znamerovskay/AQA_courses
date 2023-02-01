package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class InputPage {

    private final SelenideElement inputButton = $("//*[@class = 'step1-part']/h3");

    public void openInputPage(){
        inputButton.shouldBe(Condition.visible);
    }
}
