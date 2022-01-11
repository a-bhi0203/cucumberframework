package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = {"@target/failed_test.txt"}, glue = {"stepDefinitions"},
        tags = "", monochrome = true, dryRun = false,
        plugin = {"pretty",
                "html:target/cucumber_failed",
                "json:target/cucumber_failed.json"})

public class FailedRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}


