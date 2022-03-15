package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
   features = "src/test/resources/features",
   glue = "com/cydeo/step_definitions"
)
public class CukesRunner {
}
