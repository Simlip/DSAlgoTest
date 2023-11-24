package runner;

//import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //JUnit execution

@CucumberOptions(
		plugin = {"pretty", "html:target/test-output" , "json:target/cucumber.json" , 
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //reporting purpose
		monochrome=true,  //console output color
		//tags = "  @tag1", //tags from feature file
		features= {"src/test/resources/features"},
		glue= {"stepDefinition"}, //location of step definition files
		dryRun=false
		)

public class TestRunner  extends AbstractTestNGCucumberTests {
	
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
	return super.scenarios();  
	}
}
