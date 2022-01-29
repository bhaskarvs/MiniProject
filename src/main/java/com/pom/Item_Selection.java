package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Item_Selection {
	
	public WebDriver driver;
	
	public WebElement getItem_selection() {
		return Item_selection;
	}

	@FindBy(xpath ="(//img[@class='replace-2x img-responsive'])[2]")
    private WebElement Item_selection;

	public Item_Selection(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

}
