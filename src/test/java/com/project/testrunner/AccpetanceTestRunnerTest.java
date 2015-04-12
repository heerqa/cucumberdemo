package com.project.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureStories", plugin={"pretty", "html:target/html"}, glue="com.eagree.tests")
public class AccpetanceTestRunnerTest {

}
