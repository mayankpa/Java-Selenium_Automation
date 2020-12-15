package seleniumExample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePickerExample {
    WebDriver driver;
    @Test
    public void testWebdriverManager(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://money.rediff.com/index.html");
        driver.manage().window().maximize();


    }
}
