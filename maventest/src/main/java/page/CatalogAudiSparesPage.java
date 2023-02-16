package page;

import org.openqa.selenium.By;

/**
 * Class CatalogAudiSparesPage
 *
 * @author Irina.Znamerovskay
 * @data 16.02.2023
 */
public class CatalogAudiSparesPage extends BasePage{

    private By firstSparesForAudi = By.xpath("//*[@href = 'https://inside-auto.com/catalog/audi_12/100-44-44q-c3_153']");

    /**
     * @return Displays the first spares for Audi
     */
    public boolean isDisplayedSpares(){
        return driver.findElement(firstSparesForAudi).isDisplayed();
    }
}
