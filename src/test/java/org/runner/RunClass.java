package org.runner;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Files",glue="org.stepdefinition",
snippets=SnippetType.CAMELCASE,dryRun=false,strict=true,tags= {"@Smoke"},plugin= {"pretty",
"json:C:\\Users\\prabu\\eclipse-workspace\\Overstockart1\\All Reports\\Json Report\\art.json"		
		
})
public class RunClass extends BaseClass {
@AfterClass	
public static void report() throws Throwable  {
	
	JvmReport.getJvmReport("All Reports\\Json Report\\art.json");
	 screenShot("art");


	
	
	

}
	
}
