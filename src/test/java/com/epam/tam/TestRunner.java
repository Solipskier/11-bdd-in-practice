package com.epam.tam;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"}, glue = {"com.epam.tam.stepdefs", "com.epam.tam.hooks"})
public class TestRunner {
}
