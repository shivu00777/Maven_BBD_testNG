package File_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/resources/Features"},

glue= {"Code_Steps"},

plugin= {"pretty","html:target/htmlreport.html"})


public class runner extends AbstractTestNGCucumberTests {

}











