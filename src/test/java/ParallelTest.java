import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ParallelTest {
    @BeforeMethod
    @Parameters("testName")
    public void setup(@Optional("defaultTest") String testName){
        WebDriver driver=new ChromeDriver();
        DriverManager.setDriver(testName,driver);
    }
    @Test
    @Parameters("testName")
    public void testGoogle(@Optional("defaultTest") String testName){
        WebDriver driver=DriverManager.getDriver(testName);
        driver.get("https://www.google.com");
        System.out.println("Title for " + testName + ": " + driver.getTitle());
    }
    @AfterMethod
    @Parameters("testName")
    public void tearDown(@Optional("defaultTest") String testName){
        DriverManager.quitDriver(testName);
    }
}
