package com.sophossolutions.demos.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = {"com.sophossolutions.demos.stepdefinitions","com.sophossolutions.demos.hooks"},
        features = "src/test/resources/com/sophossolutions/demos/features/star_sharp.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class StarSharp {
}
