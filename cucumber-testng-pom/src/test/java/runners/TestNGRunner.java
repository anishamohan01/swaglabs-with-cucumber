package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"stepDefinitions"},
    plugin = {"pretty", "html:target/testng-cucumber-report.html"},
    monochrome = true
)
public class TestNGRunner extends AbstractTestNGCucumberTests {
}
