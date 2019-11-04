package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature/login.feature" , glue= {"stepDefination"},
monochrome=true,
plugin= {"pretty","jason:target/cucumber.json"})
public class LoginRunner {

}
