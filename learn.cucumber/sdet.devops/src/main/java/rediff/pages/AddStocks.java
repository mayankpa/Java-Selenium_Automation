package rediff.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AddStocks {
    private WebDriver driver;
    private WebDriverWait wait;

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
    @FindBy(className = "optionDivSelected")
    private WebElement selectFirstValue;
    @FindBy(name="equityid")
    private WebElement equityid;
    @FindBy(name="Delete")
    private WebElement delete;
    @FindBy(xpath = "//div[@id='ajax_listOfOptions']/div[3]")
    private WebElement clickOnElement;
    @FindBy(id="stocklatesttotal")
    private WebElement getTotalValue;

    public AddStocks(WebDriver driver){
        this.driver= driver;
        wait= new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
    }
    public void addStock(String stockName, String date, String qty, String price){
        this.addStock.click();
        this.wait.until(ExpectedConditions.visibilityOf(this.addStockName));
        this.addStockName.sendKeys(stockName);
        this.wait.until(ExpectedConditions.visibilityOf(this.clickOnElement));
        this.clickOnElement.click();
        this.wait.until(ExpectedConditions.visibilityOf(this.stockAddDate));
        this.stockAddDate.sendKeys(date);
        this.addStockQty.sendKeys(qty);
        this.addstockprice.sendKeys(price);
        this.addStockButton.click();
    }

    public void deleteStock(){
        this.wait.until(ExpectedConditions.visibilityOf(this.equityid));
        this.equityid.click();
        this.delete.click();
        driver.switchTo().alert().accept();
        driver.switchTo().defaultContent();
    }

    public String totalPortfoloioValue(){
        String totalValue=this.getTotalValue.getText();
        return totalValue;
    }
    public void quit(){
        driver.quit();
    }
}
