package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features",tags = "@data-driven",
glue = { "stepDefinition"}
)

public class Runnerclass {

}
