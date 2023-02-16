package page;

import dataproviders.SparesData;
import org.openqa.selenium.By;

/**
 * Class MainPage
 *
 * @author Irina.Znamerovskay
 * @data 16.02.2023
 */
public class MainPage extends BasePage {

    SparesData sparesData = new SparesData();

    private final By searchField = By.xpath("//*[@class = 'input-text']");
    private final By searchButton = By.xpath("//*[@id = 'button_search']");
    private final By sortingButton = By.xpath("//*[text() ='Сортування']");
    private final By entranceButton = By.xpath("//*[text() = 'Вхід']");

    private final By audiButton = By.xpath(" //*[@alt = 'AUDI']");


    /**
     * @param spares
     * Click on search field and enter data
     */
    public void clickOnSearchFieldAndEnterData(String spares) {
        driver.findElement(searchField).click();
        driver.findElement(searchField).sendKeys(spares);
    }

    /**
     * Clear search field to enter new data
     */
    public void clearSearchField() {
        driver.findElement(searchField).clear();
    }

    /**
     * Click on search button
     */
    public void clickOnSearchButton() {
        driver.findElement(searchButton).click();
    }

    /**
     * @return Displays sorting button
     */
    public boolean isDisplayedSortingButton() {
        return driver.findElement(sortingButton).isDisplayed();
    }

    /**
     * Click on entranced button
     */
    public void clickOnEntrancedButton(){
        driver.findElement(entranceButton).click();
    }

    /**
     * Click on Audi button
     */
    public void clickOnAudiButton(){
        driver.findElement(audiButton).click();
    }

}
