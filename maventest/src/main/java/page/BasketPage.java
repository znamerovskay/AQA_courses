package page;

import org.openqa.selenium.By;

import static page.BasePage.driver;

/**
 * Class BasketPage
 *
 * @author Irina.Znamerovskay
 * @data 16.02.2023
 */
public class BasketPage extends BasePage{

    private By basketEmpty = By.xpath("//*[@class = 'woocommerce']");


    /**
     * @return Empty basket displayed
     */
    public boolean isDisplaedFieldBasketEmpty(){
       return driver.findElement(basketEmpty).isDisplayed();
    }
}
