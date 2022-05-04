package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class ActivityRunner_6 {

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "Features",
            glue = {"stepDefinitions"},
            tags = "@SimpleAlert",
            plugin = {"pretty"},
            monochrome = true
    )

    public class ActivitiesRunner {
        // blank
    }
}
