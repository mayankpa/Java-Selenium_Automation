package rediff.testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import rediff.pages.AddStocks;
import rediff.pages.HomePage;

public class TC3_AddStocks {
    private WebDriver driver;

    private String username;
    private String password;
    private String stockname;
    private String stockdate;
    private String stockQty;
    private String stockPrice;
    @BeforeTest
    @Parameters({"username","password","stockname","stockdate","stockQty","stockPrice"})
    public void setup(String username, String password, String stockname, String stockdate, String stockQty, String stockPrice){
        this.username = username;
        this.password = password;
        this.stockname= stockname;
        this.stockdate= stockdate;
        this.stockQty= stockQty;
        this.stockPrice=stockPrice;

        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test()
    public void test_login(){
        HomePage homePage = new HomePage(driver);
        homePage.goToUrl();
        homePage.login(username,password);
    }
    @Test(dependsOnMethods = "test_login")
    public void test_AddStocks(){
        AddStocks addStocks = new AddStocks(driver);
        addStocks.addStock(stockname,stockdate,stockQty,stockPrice);
        String portfolioValue= addStocks.totalPortfoloioValue();
        System.out.println(portfolioValue);
        addStocks.quit();
    }


}
