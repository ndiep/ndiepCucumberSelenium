package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature/AutoLoanSignUp.feature"
		,glue={"stepDefinition"}
		,monochrome = true
		,plugin={"pretty","html:Results/cucumber", "json:Results/cucumber_report.json"}
		,tags = {"~@Ignore", "~@ignore"}
		)

public class TestRunner {

}
