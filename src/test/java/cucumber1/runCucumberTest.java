package cucumber1;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber-json", "junit:target/cucumber-junit.xml"})
public class runCucumberTest {

}
