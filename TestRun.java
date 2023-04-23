package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"C:\\Users\\LENOVO\\eclipse-workspace\\XlatProject"},
		glue = {"stepDefinitions"},
		dryRun = false,
		monochrome=true,
		plugin =   {"pretty", "html:target/cucumber-html-report", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		tags = "",
		publish = true)
		
public class TestRun {

}
