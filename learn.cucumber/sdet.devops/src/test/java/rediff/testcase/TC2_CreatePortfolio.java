package rediff.testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import rediff.pages.HomePage;
import rediff.pages.LandingPage;

public class TC2_CreatePortfolio {
    private WebDriver driver;
    private String username;
    private String password;
    private String portfolioName;
    @BeforeTest
    @Parameters({"username","password","portfolioName"})
    public void setup(String username, String password, String portfolioName){
        this.username = username;
        this.password = password;
        this.portfolioName = portfolioName;
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
    public void test_createPortfolio(){
        LandingPage landingPage= new LandingPage(driver);
        landingPage.createPortfolio(portfolioName);
        landingPage.verifyProtfolio(portfolioName);
        landingPage.deleteProtfolio();
        landingPage.quit();
    }
}
