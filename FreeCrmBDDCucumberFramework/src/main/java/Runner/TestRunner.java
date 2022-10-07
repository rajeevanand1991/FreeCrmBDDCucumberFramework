package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\eclipseWorkspace\\FreeCrmBDDCucumberFramework\\src\\main\\java\\Features\\dealsmap.feature",
		glue = {"stepDefinitions"},
		//format = {"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome = true, //Display the console output in a proper readable format
		strict = true, // it will check and fail the execution, if there are any pending steps or not defined steps in stepDefinition file, it should be treated as errors.
		dryRun = false //dryRun = true ===> it will check the mapping first between feature file with compared to StepDefinition file, It will not proceed to TestExecution
		//dryRun = false will allow now to proceed for TestExecution
		)

public class TestRunner {

}