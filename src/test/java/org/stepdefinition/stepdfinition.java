package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.pojo.AddtoCart;
import org.pojo.SignInPOJO;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdfinition extends BaseClass {
	
	
	SignInPOJO p;
    AddtoCart add;

@Given("user have to launch the Overstockart application in chrome browser")
public void userHaveToLaunchTheOverstockartApplicationInChromeBrowser() {
	
	
	maxBrowser();
	dateAndTimeBefore();
    
}

@When("user have to enter the valid email and password")
public void userHaveToEnterTheValidEmailAndPassword() {
	p=new SignInPOJO();
	moveTheElememnt(p.getM());
	enterTheValue(p.getMail(), "prabucivil666@gmail.com");
	enterTheValue(p.getPass(), "12109780Nsp@");
	clickTheButton(p.getSignin());
    
}

@When("user have to search Traditional Art and add to cart the product")
public void userHaveToSearchTraditionalArtAndAddToCartTheProduct() throws AWTException, InterruptedException {
	Actions a = new Actions(driver);
		Robot r = new Robot();
		add = new AddtoCart();
		
		enterTheValue(add.getS(), "Traditional Art");
		clickTheButton(add.getC());
		clickTheButton(add.getB());
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", add.getAdd());
		moveTheElememnt(add.getV());
		js.executeScript("arguments[0].click()", add.getProceed());
		js.executeScript("arguments[0].click()", add.getPro());
		waitsMethod();
		enterTheValue(add.getMsg(), "Hi");
		js.executeScript("arguments[0].click()", add.getNext());
		
		javaClick(add.getFin());
		//valueSelect(add.getState(), "1503");
		Thread.sleep(5000);
		
		//enterTheValue(add.getTex(), "Hello");
		//0clickTheButton(add.getNextf());
		js.executeScript("arguments[0].setAttribute('value','Hello')", add.getText());
		//javaClick(add.getClick());
		Thread.sleep(6000);
		driver.findElement(By.id("shippingDeliveryNextStep")).click();
		enterTheValue(add.getCard(), "9876543210123456");
		indexSelect(add.getMonth(), 8);
		indexSelect(add.getYear(), 9);
		enterTheValue(add.getCvv(), "987");
		javaClick(add.getPlace());
	
}

@Then("to verify product is added to cart")
public void toVerifyProductIsAddedToCart() {
   dislplayeMethod(add.getCheck());
}

@When("user have to enter the invalid {string} and {string}")
public void userHaveToEnterTheInvalidAnd(String email, String pass) {
	p=new SignInPOJO();
	moveTheElememnt(p.getM());
    enterTheValue(p.getMail(), email);
    enterTheValue(p.getPass(), pass);
}

@When("user have to click the sign in button")
public void userHaveToClickTheSignInButton() {
	clickTheButton(p.getSignin());
   
}

@Then("to verify sign in is completed")
public void toVerifySignInIsCompleted() {
	if (pageUrl().contains("my-gallery")) {
		
		System.out.println("Verified");
		
	} else {
		System.out.println("Not Verified");

	}
    
}



	
	
	
	
	

}
