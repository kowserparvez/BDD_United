package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src\\test\\java\\feature\\united.feature",
			glue= {"Stepdefination"})
			

	public class Scrumrunner{

		
}