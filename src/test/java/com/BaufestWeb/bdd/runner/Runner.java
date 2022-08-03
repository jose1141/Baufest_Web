package com.BaufestWeb.bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.BaufestWeb.bdd.stepDefinitions",
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"},
        //tags = {"@Sanity, @Regression"},
        monochrome = true
)
public class Runner {
}
