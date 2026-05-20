package StepDefinition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/resources/featuresfiles/Login.feature"}, 
glue="StepDefinition", plugin = {"pretty", "html:target/OrangeHRM-reports.html"})
public class TestRunner extends AbstractTestNGCucumberTests{
	
}
