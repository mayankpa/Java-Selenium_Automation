package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTestNg {
    WebDriver driver ;
    @Test
    public void learnTestNg(){
        System.out.println("Hello I am learning cucumber ");
        System.setProperty("webdriver.gecko.driver",
                System.getProperty("user.dir") + "/drivers/geckodriver.exe");
        //driver= new ChromeDriver();
        driver = new FirefoxDriver();

        driver.get("https://www.google.com");
    }
}
