package productstore;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"productstore"},
            features = "src/test/resources/features/signup.feature")
public class SignUpTest {
}