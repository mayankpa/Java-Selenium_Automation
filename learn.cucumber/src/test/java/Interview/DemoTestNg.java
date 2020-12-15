package Interview;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DemoTestNg {
    WebDriver driver;

    @FindBy(css = "input[type=submit]")
    private WebElement getQuote;
    @FindBy(linkText = "Sign In")
    private WebElement signIn;
    @FindBy(id="useremail")
    private WebElement username;
    @FindBy(id="userpass")
    private WebElement password;
    @FindBy(id="loginsubmit")
    private WebElement submit;
    @FindBy(linkText = "Sign Out")
    private WebElement signOut;
    @FindBy(id="addStock")
    private WebElement addStock;
    @FindBy(id="addstockname")
    private WebElement addStockName;
    @FindBy(id="stockAddDate")
    private WebElement stockAddDate;
    @FindBy(id="addstockqty")
    private WebElement addStockQty;
    @FindBy(id="addstockprice")
    private WebElement addstockprice;
    @FindBy(id="addStockButton")
    private WebElement addStockButton;
    @FindBy(xpath = "//div[@id='ajax_listOfOptions']/div[@id='14030001']")
    private WebElement selectFirstValue;
    @FindBy(name="equityid")
    private WebElement equityid;
    @FindBy(name="Delete")
    private WebElement delete;

        public void testMethod() {
            System.out.println("Hello TestNG Interview section");
            System.setProperty("webdriver.gecko.driver",
                    System.getProperty("user.dir") + "/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get("https://www.google.com");
        }

        public void testChrome(){
            System.out.println("Chrome Test");
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/Chrome/83/chromedriver.exe");
            driver= new ChromeDriver();
            driver.get("https://www.google.com");

        }
        @Test (priority = 0)
        public void testAddStocks(){
            driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.get("https://money.rediff.com/index.html");
            driver.manage().window().maximize();
            signIn.click();
            username.sendKeys("qa.1982");
            password.sendKeys("Mrp1982$");
            submit.click();
        }


}
