package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart extends BaseClass {

	public AddtoCart() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({
		@FindBy(xpath="//input[@name='search']"),
		@FindBy(name="search")
	})
	private WebElement s;
	
	@FindAll({
		@FindBy(xpath="//div[@id='search_button']"),
		@FindBy(id="search_button")
	})
	private WebElement c;
	
	@FindAll({
		@FindBy(xpath="//span[text()='Study for Spanish Dancer, 1879-1882 - 24\\\" x 36\\\"']"),
		@FindBy(xpath="(//div[@class='subCategoryPhotoContainer'])[2]")
		
	})
	private WebElement b;
	
	@FindAll({
		
	@FindBy(xpath="//button[text()='Add to cart']")
	})
	private WebElement add;
	
	@FindAll({
		@FindBy(xpath="//div[@class='cart-icon-block']"),
		
	})
	private WebElement v;
	
	@FindAll({
		@FindBy(xpath="//a[text()='Proceed to checkout']"),
		@FindBy(id="headerMyCartProceed")
	})
	private WebElement proceed;
	
	@FindAll({
		@FindBy(xpath="//a[@class='cartProceedToCheckoutLink']"),
		@FindBy(className="cartProceedToCheckoutLink")
	})
	private WebElement pro;
	
	@FindAll({
		@FindBy(xpath="//textarea[@id='giftComment']"),
		@FindBy(xpath="//textarea[@name='gift_message']")
	})
	private WebElement msg;
	public WebElement getMsg() {
		return msg;
	}

	@FindAll({
		@FindBy(xpath="//a[@id='billingInfoNextStep']"),
		@FindBy(id="billingInfoNextStep")
	})
	private WebElement next;
	
	@FindAll({
		@FindBy(id="billingStateSelectContainer")
	})
	
	private WebElement state;
	
	@FindBy(id="billingInfoNextStep")
	private WebElement fin;
	
	@FindAll({
		@FindBy(xpath="//textarea[@id='shippingComment']"),
		@FindBy(id="shippingComment")
	})
	private WebElement text;
	
	public WebElement getText() {
		return text;
	}

	@FindAll({
		
		@FindBy(xpath="//a[@id='shippingDeliveryNextStep']"),
		@FindBy(id="shippingDeliveryNextStep")
	})
	
	private WebElement nextf;
	
	@FindBy(name="comment")
	private WebElement tex;
	
	public WebElement getTex() {
		return tex;
	}

	@FindAll({
		@FindBy(xpath="//span[text()='Review Your order and Pay']"),
		@FindBy(xpath="(//span[@class='shoppingBillingWindowTitleText'])[6]")
		
	})
	private WebElement click;
	
	public WebElement getClick() {
		return click;
	}

	@FindBys({
		@FindBy(id="cartNumberInput"),
		@FindBy(xpath="//input[@placeholder='Card Number']")
	})
	private WebElement card;
	
	@FindBy(id="paymentMonthSelectContainer")
	private WebElement month;
	
	@FindAll({
		@FindBy(id="paymentYearSelectContainer"),
		@FindBy(xpath="//select[@name='cc_expire_date_year']")
	})
	private WebElement year;
	
	@FindBys({
		@FindBy(id="cartCCVInput"),
		@FindBy(xpath="//input[@placeholder='CVV']")
	})
	private WebElement cvv;
	
	@FindBy(xpath="//span[text()='Place Order']")
	private WebElement place;
	
	@FindBy(xpath="//span[text()='Study for Spanish Dancer, 1879-1882']")
	private WebElement check;

	public WebElement getS() {
		return s;
	}

	public WebElement getC() {
		return c;
	}

	public WebElement getCheck() {
		return check;
	}

	public WebElement getB() {
		return b;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getV() {
		return v;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getPro() {
		return pro;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getFin() {
		return fin;
	}

	public WebElement getNextf() {
		return nextf;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getPlace() {
		return place;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
