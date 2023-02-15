package dataproviders;
import org.testng.annotations.DataProvider;
import utils.PropertiesFactory;

public class SparesData{

        @DataProvider
        public Object[][] sparesData() {
            return new Object[][]{
                    {PropertiesFactory.getEngineValve("engine_valve")},
                    {PropertiesFactory.getCamera("camera")},
                    {"камера"}
            };
        }
}
