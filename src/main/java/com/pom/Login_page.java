package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	
	public WebDriver driver;

	//set value 
	@FindBy(xpath = "(//input[@data-validate='isEmail'])[2]")

	private WebElement Email;

	@FindBy(xpath = "//input[@type='password']")

	private WebElement Password;

	@FindBy(id = "SubmitLogin")

	private WebElement Submit;
	
	//Getters 

	public Login_page(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	
    public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSubmit() {
		return Submit;

}
}