package rediff.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

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


    public HomePage(WebDriver driver){
        this.driver= driver;
        wait = new WebDriverWait(driver, 30 );
        PageFactory.initElements(driver,this);
    }

    public void goToUrl(){
        this.driver.get("https://money.rediff.com/index.html");
        driver.manage().window().maximize();
        this.wait.until(ExpectedConditions.visibilityOf(this.getQuote));
    }

    public void login(String uid, String pwd){
        this.signIn.click();
        this.wait.until(ExpectedConditions.visibilityOf(this.username));
        this.username.sendKeys(uid);
        this.password.sendKeys(pwd);
        this.submit.click();
        this.wait.until(ExpectedConditions.visibilityOf(this.signOut));
    }


}
