package com.deka.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/deka/step_definitions",
        features = "src/test/resources/features",
        tags = "@wip",
        dryRun = false

)





public class CukesRunner {




}
