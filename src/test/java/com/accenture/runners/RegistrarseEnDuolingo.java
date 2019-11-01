package com.accenture.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
		features = "src/test/resources/features",
		glue = "com.accenture.stepdefinitions")

public class RegistrarseEnDuolingo {

}