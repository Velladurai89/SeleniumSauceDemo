//package StepDefinition;
//
//
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//
//@CucumberOptions(
//    features = "src/test/resources/Features",  // Path to .feature files
//    glue = {"StepDefinition"},  // Package for step definitions
//    plugin = {"pretty", "html:target/cucumber-reports.html"},
//    monochrome = true
//)
//public class TestRunner extends AbstractTestNGCucumberTests {
//}
//

package com.qa.saucedemo.testrunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = { 
				"src/test/resources/features/1_login.feature",
				"src/test/resources/features/2_products.feature",
				"src/test/resources/features/3_checkout.feature",
				"src/test/resources/features/4_information_page.feature",
				"src/test/resources/features/5_orderpage.feature",
				"src/test/resources/features/6_orderhistory.feature"},

    glue = {"com.qa.saucedemo.stepdefinitions"},  // Step definition package
    plugin = {
        "pretty", 
        "html:target/cucumber-reports.html",
        "json:target/cucumber-reports.json",
        "rerun:target/rerun.txt"  // Generates rerun file for failed tests
    },
    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

    // ✅ Ensures tests run in a single session
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
