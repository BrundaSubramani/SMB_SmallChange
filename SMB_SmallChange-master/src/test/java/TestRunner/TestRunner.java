package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Feature/Email/Email1_1gb_12M_4G.feature",
		glue={"StepDefinition"},
		monochrome = true,
		plugin = {"json:target/MyReport/report.json","junit:target/MyReport/report.xml","html:target/MyReport/report.html"}

		)

		
public class TestRunner {

	
}
