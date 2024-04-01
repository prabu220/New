package org.stepdefinition;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	@Before
	public static void before() {
		chromeBrowser();
		urlLaunch("https://www.overstockart.com/");

	} 
	
	@After
	public static void after() {
		dateAndTimeAfter();
		//closeTheBrowser();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
