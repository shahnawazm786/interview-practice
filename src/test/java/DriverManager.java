import org.openqa.selenium.WebDriver;

import java.util.concurrent.ConcurrentHashMap;

public class DriverManager {
    private static final ConcurrentHashMap<String, WebDriver> driverMap=new ConcurrentHashMap<>();
    public static void setDriver(String testName,WebDriver driver){
        driverMap.put(testName,driver);
    }
    public static WebDriver getDriver(String testName){
        return  driverMap.get(testName);
    }
    public static void quitDriver(String testName){
        WebDriver driver=driverMap.get(testName);
        if(driver!=null){
            driver.quit();
            driverMap.remove(testName);
        }
    }
}
