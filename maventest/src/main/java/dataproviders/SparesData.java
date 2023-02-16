package dataproviders;
import org.testng.annotations.DataProvider;
import utils.PropertiesFactory;

/**
 * Class SparesData
 *
 * @author Irina.Znamerovskay
 * @data 16.02.2023
 */
public class SparesData{

    /**
     * DataProvider for sparesData
     * @return
     */
        @DataProvider
        public Object[][] sparesData() {
            return new Object[][]{
                    {PropertiesFactory.getEngineValve("engine_valve")},
                    {PropertiesFactory.getCamera("camera")},
                    {"камера"},
                    {"колпачок"},
                    {"шини"}
            };
        }
}
