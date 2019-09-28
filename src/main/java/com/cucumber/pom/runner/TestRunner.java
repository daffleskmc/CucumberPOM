package com.cucumber.pom.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\indeztruk\\eclipse-workspace\\CucumberPOM\\src\\main\\java\\com\\cucumber\\pom\\feature\\cp.feature", glue = {
		"com/cucumber/pom/stepDefinitions" }, format = { "pretty", "html:test-output", "json:json-output/cucumber.json",
				"junit:junit-output/cucumber.xml" }, monochrome = true, strict = true, dryRun = false)

public class TestRunner {

}
