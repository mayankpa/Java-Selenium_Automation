import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class OpenSeleniumGrid {
    public RemoteWebDriver driver;
    public static String appURL="https://www.google.com";

   @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps= DesiredCapabilities.chrome();
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
        driver.manage().window().maximize();

    }
    @Test
    public void testGooglePageTitle(){
       System.out.println("Navigate Google");
       driver.navigate().to(appURL);
       String pageTitle = driver.getTitle();
       Assert.assertTrue("Page Title not", pageTitle.equalsIgnoreCase("Google"));
    }

    @AfterClass
    public void quit(){
    if(driver != null){
        driver.quit();
    }
   }
}
