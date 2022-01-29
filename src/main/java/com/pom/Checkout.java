package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
	
	private WebElement Checkout;


	public Checkout(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}


	public WebElement getCheckout() {
		return Checkout;

}
}