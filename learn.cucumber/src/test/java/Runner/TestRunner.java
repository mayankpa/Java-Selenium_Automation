package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Patel\\IdeaProjects\\learn.cucumber\\features\\" ,
        glue={"steps"},
        strict = true
)
public class TestRunner {

}