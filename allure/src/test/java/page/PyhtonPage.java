package page;

import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$x;

public class PyhtonPage {

    private WebElement javaButton = $x("//*[text() = 'Java']");
    private WebElement warmup1Pyhton = $x("//*[text() = 'Warmup-1']");
    private WebElement firstTask = $x("//*[text() = 'sleep_in'] ");
    private WebElement slowSolution = $x("//*[@class = 'gray']");
    private WebElement solution = $x("//*[@id = 'results']/pre");


    public void clickOnJavaButton(){
        javaButton.click();
    }

    public boolean  isVisibleWarmup1() {
        return warmup1Pyhton.isDisplayed();
    }
    public boolean  isVisibleSolution(){
        warmup1Pyhton.click();
        firstTask.click();
        slowSolution.click();
        return solution.isDisplayed();
    }
}
