package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Section {
	
	public WebDriver driver;
	
	@FindBy(xpath= "//a[@title='Women']")
	
	private WebElement Women_Section;
	

	public Women_Section(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}



	public WebElement getWomen_Section() {
		return Women_Section;

}
}
