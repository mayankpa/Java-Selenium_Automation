package TestNGRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/features/",
        glue = "steps",
        plugin = {"pretty","html:HTML-Reports"},
        monochrome = true,
        tags = {"smoke"}
)
public class TestNG_Runner extends AbstractTestNGCucumberTests {
}
