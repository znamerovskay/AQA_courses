package page;

import dataproviders.SparesData;
import org.openqa.selenium.By;

public class MainPage extends BasePage {

    SparesData sparesData = new SparesData();

    private final By searchField = By.xpath("//*[@class = 'input-text']");
    private final By searchButton = By.xpath("//*[@id = 'button_search']");
    private final By sortingButton = By.xpath("//*[text() ='Сортування']");
    private final By entranceButton = By.xpath("//*[text() = 'Вхід']");


    public void clickOnSearchFieldAndEnterData(String spares) {
        driver.findElement(searchField).click();
        driver.findElement(searchField).sendKeys(spares);
    }

    public void clearSearchField() {
        driver.findElement(searchField).clear();
    }

    public void clickButton() {
        driver.findElement(searchButton).click();
    }

    public boolean isDisplaydesSortingButton() {
        return driver.findElement(sortingButton).isDisplayed();
    }

    public void clickOnEntrancetButton(){
        driver.findElement(entranceButton).click();
    }

}
