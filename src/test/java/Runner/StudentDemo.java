package Runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "Features" },
plugin = {"pretty", "html:target/cucumberHtmlReport", "json:target/json-report/report.json" },
//	monochrome = true,
	glue = { "Stepdefinition" }, 
	tags = {"@1"}
)

@Test
public class StudentDemo extends AbstractTestNGCucumberTests {
 
}
