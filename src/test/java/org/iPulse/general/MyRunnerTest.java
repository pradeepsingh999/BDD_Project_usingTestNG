package org.iPulse.general;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
				strict=true,
				dryRun=false,
				monochrome=true,
				
				features={"src/test/resources/"},
				glue={"org.iPulse.general"},
				
				plugin={
						"pretty",
						"html:target/site/cucumber-html",
						"json:target/cucumber.json"
						
				}
		
		
		
		
		
		
		)






public class MyRunnerTest extends AbstractTestNGCucumberTests {

}
