package Runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "Features" },
plugin = { "pretty", "html:target/cucumber-html-reports", "io.qameta.allure.cucumberjvm.AllureCucumberJvm",
"json:target/cucumber-html-reports/cucumber.json"},
	monochrome = true,
	glue = { "Stepdefination" }, 
	tags = {"@5"}
)

@Test
public class Student extends AbstractTestNGCucumberTests {

}
