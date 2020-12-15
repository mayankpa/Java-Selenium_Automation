package rediff.testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_SeleniumTest {
    public WebDriver driver;


    @Test
    public void test_WebDriverManager(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://money.rediff.com/index.html");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        //Assert.assertEquals(title,"BSE: 40,685.50 | NSE: 11,930.35 - Live Stock Market | Share Prices | Mutual Fund India: Rediff MoneyWiz");
        driver.quit();
    }
}
