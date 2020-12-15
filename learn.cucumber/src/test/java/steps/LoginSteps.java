package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginSteps {
    WebDriver driver;


    @When("^I land on homepage$")
    public void iLandOnHomepage() {
        System.out.println("I am second steps");
    }

    @Then("^I see Login button$")
    public void iSeeLoginButton() {
        System.out.println("I am third step");
    }



    @Given("^I navigate url$")
    public void iNavigateUrl() {
        System.setProperty("webdriver.gecko.driver",
                System.getProperty("user.dir") + "/drivers/geckodriver.exe");
        //driver= new ChromeDriver();
        driver = new FirefoxDriver();

        driver.get("https://www.google.com");
    }
}
