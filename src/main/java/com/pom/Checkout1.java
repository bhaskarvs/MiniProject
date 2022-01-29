package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout1 {
	
	public WebDriver driver;
	

	public Checkout1(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckout1() {
		return Checkout1;
	}

	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
	
	private WebElement Checkout1;

}
