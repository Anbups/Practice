package runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import report.ReportClass;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\SeleniumLearning\\cucumber\\src\\test\\resources\\Feature\\AccountCreation.feature",
glue= {"hooks","stepDefPackage"},monochrome=true,plugin= {"pretty","json:src/test/resources/JvmReport/output.json"})
public class TestRunnerClass {
	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {
		ReportClass.generateJvmReport("src/test/resources/JvmReport/output.json");
	}

}
