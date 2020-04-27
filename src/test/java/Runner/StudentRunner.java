package Runner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.ObjectMapperConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;

@CucumberOptions(features = { "Features" }, plugin = { "pretty",
		"io.qameta.allure.cucumberjvm.AllureCucumberJvm",
		"json:target/cucumber-html-reports/cucumber.json" }, monochrome = true, glue = {
				"Stepdefination" }, tags = { "@TestDemo" })

@Test
public class StudentRunner extends AbstractTestNGCucumberTests {
	@BeforeClass
	public void setUp() {
		RestAssuredConfig restAssuredConfig = RestAssuredConfig.config()
				.objectMapperConfig(new ObjectMapperConfig(ObjectMapperType.GSON));

		RestAssured.requestSpecification = new RequestSpecBuilder()
				.setConfig(restAssuredConfig)
				.setContentType(ContentType.JSON)
				.setBaseUri("http://localhost:8080")
				.setBasePath("/student")
				.build();
	}
}
