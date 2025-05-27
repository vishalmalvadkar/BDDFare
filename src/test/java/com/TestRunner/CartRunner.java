package com.TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.stepDef.CartStepDef"},
        monochrome = true,
        dryRun = true
)
public class CartRunner extends AbstractTestNGCucumberTests {
}
