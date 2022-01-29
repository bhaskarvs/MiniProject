package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Selection {
	
	public WebDriver driver;
	
	public Dress_Selection(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

 
	public WebElement getFrame() {
		return Frame;
	}

	public WebElement getDress_Quantity() {
		return Dress_Quantity;
	}


	public WebElement getDress_Size() {
		return Dress_Size;
	}


	public WebElement getDress_Colour() {
		return Dress_Colour;
	}

	public WebElement getAddCart() {
		return AddCart;
	}

	
	@FindBy(tagName="iframe")
	
	private WebElement Frame;
	
	@FindBy(xpath="//a[@class='btn btn-default button-plus product_quantity_up']")
	
	private WebElement Dress_Quantity;
	
	@FindBy(xpath="//select[@id='group_1']")
	
	private WebElement Dress_Size;
	
	
	@FindBy(xpath= "//a[@title='Blue']")
	
	private WebElement Dress_Colour;
	
	
	@FindBy(xpath="//button[@class='exclusive']")
	
	private WebElement AddCart;
	


}

