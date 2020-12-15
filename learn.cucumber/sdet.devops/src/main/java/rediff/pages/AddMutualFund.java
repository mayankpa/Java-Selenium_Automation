package rediff.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddMutualFund {
    private WebDriver driver;
    private WebDriverWait wait;

    public AddMutualFund(WebDriver driver){
        this.driver= driver;
        wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }
    @FindBy(name="+ Add MF / SIP")
    private WebElement addMutualFundButton;


}
