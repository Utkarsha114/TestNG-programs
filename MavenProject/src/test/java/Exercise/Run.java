package Exercise;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/resources/featuresfiles/AutomationExercise.feature"}, 
glue="Exercise", plugin = {"pretty", "html:target/AutomationExercise-reports.html"})
public class Run extends AbstractTestNGCucumberTests{

}





