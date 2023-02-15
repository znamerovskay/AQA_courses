package utils;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFactory {

    public static String getUrl(String name) {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream("src/main/resources/project.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(name);
    }
    public static String getEngineValve(String name) {
        Properties prop2 = new Properties();
        try {
            prop2.load(new FileInputStream("src/main/resources/project.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop2.getProperty(name);
    }
    public static String getCamera(String name) {
        Properties prop3 = new Properties();
        try {
            prop3.load(new FileInputStream("src/main/resources/project.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop3.getProperty(name);
    }
}
