package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(Features , glue,
monochrome=true,
plugin= {"pretty","html:test-output"})
public class LoginRunner {

}
