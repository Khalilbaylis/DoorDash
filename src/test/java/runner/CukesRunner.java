package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        },
        features = {"src/test/resources/features/Sign_Up.feature"},
        glue ={"step_definitions"}
        , dryRun = false
        , tags = ""
)

public class CukesRunner {
}
