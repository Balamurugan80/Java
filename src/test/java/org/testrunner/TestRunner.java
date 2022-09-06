package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.com.JVMReporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\featurefiles",glue="org.stepdefinition.com",dryRun = false,
plugin ={"html:C:\\Users\\Manoj Kumar A\\eclipse-workspace\\Cucumber\\Reports\\htmlreport",
"junit:C:\\Users\\Manoj Kumar A\\eclipse-workspace\\Cucumber\\Reports\\junitreport\\bala.xml",
"json:C:\\Users\\Manoj Kumar A\\eclipse-workspace\\Cucumber\\Reports\\jsonReport\\bala.json"})


public class TestRunner extends JVMReporting {
	
	@AfterClass
	public static void jvmreport() {
generateJVMreport(System.getProperty("user.dir")+"Reports\\JsonReport\\bala.json");
	}

}
