package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout3 {
	
	public WebDriver driver;
	
	
    @FindBy(xpath="//input[@type='checkbox']")
	
	private WebElement Agree_Terms;
    
	
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
	
	private WebElement Checkout3;
	
	

	public Checkout3(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAgree_Terms() {
		return Agree_Terms;
	}

	public WebElement getCheckout3() {
		return Checkout3;

}}
