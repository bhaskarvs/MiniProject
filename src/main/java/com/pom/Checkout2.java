package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout2 {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[7]")
	
	private WebElement Checkout2;

	public Checkout2(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
 	}

	public WebElement getCheckout2() {
		return Checkout2;

}}
