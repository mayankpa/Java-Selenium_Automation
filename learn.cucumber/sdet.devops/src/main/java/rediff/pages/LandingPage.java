package rediff.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
    private WebDriver driver;
    private WebDriverWait wait;

   @FindBy(id="createPortfolio")
   private WebElement createportfolio;
   @FindBy(id= "create")
   private WebElement create;
   @FindBy(id="createPortfolioButton")
   private WebElement createPortfolioButton;
   @FindBy(id="portfolioid")
   private WebElement portfolioDropdown;
   @FindBy(id="deletePortfolio")
   private WebElement deletePortfolio;



    public LandingPage(WebDriver driver){
        this.driver= driver;
        wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver,this);
    }

    public void createPortfolio(String portfolioName){
        this.createportfolio.click();
        this.wait.until(ExpectedConditions.visibilityOf(this.create));
        this.create.clear();
        this.create.sendKeys(portfolioName);
        this.createPortfolioButton.click();
        this.wait.until(ExpectedConditions.visibilityOf(this.portfolioDropdown));
    }
    public void verifyProtfolio(String portfolioName){
        Select select = new Select(this.portfolioDropdown);
        String name=select.getFirstSelectedOption().getText();
        if (name.equalsIgnoreCase(portfolioName)){
            System.out.println("Portfolio Created ");
        }else {
            System.out.println("Portfolio not cretaed");
        }
    }
    public void deleteProtfolio(){
        this.deletePortfolio.click();
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
    }
    public void quit(){
        driver.quit();
    }


}
