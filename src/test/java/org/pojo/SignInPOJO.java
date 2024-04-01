package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SignInPOJO extends BaseClass{
	
	public SignInPOJO() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({
		@FindBy(xpath="//div[contains(@class,'account-button')]")
	})
	private WebElement m;
	
	@FindAll({
		@FindBy(xpath="//input[@name='email']"),
		@FindBy(id="loginUsername")
		
	})
	private WebElement mail;
	
	@FindAll({
		@FindBy(xpath="//input[@type='password']"),
		@FindBy(id="loginPassword")
		
	})
	private WebElement pass;
	
	@FindAll({
		
		@FindBy(xpath="//*[@name='login_submit']"),
		@FindBy(id="loginSubmit")
	})
	
	private WebElement signin;
	
	public WebElement getM() {
		return m;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSignin() {
		return signin;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
