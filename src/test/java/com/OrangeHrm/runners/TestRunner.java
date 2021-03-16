package com.OrangeHrm.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty", "html:target/site/cucumber-pretty.html"},

        snippets = CucumberOptions.SnippetType.CAMELCASE,

        glue = {"com/OrangeHrm/stepdefinitions"},

        features = {"src/test/resources/features"},

        tags = "@Login",

        dryRun = true


)
public class TestRunner {
}
