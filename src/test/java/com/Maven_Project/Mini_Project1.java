package com.Maven_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.helper.File_Reader_Manager;
import com.pom.Checkout;
import com.pom.Checkout1;
import com.pom.Checkout2;
import com.pom.Checkout3;
import com.pom.Dress_Selection;
import com.pom.Home_Page;
import com.pom.Item_Selection;
import com.pom.Login_page;
import com.pom.Women_Section;
import com.sdp.Page_Object_Manager;

public class Mini_Project1 extends Base_Class {

	public static WebDriver driver = browserLaunch("chrome");// null

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws IOException {
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();

		launch_Url(url);

		timewait(15);

		click_Element(pom.getInstanceHome().getSignIN());
		
		String email = File_Reader_Manager.getInstanceFRM().getInstanceCR().getEmail();

		input_values(pom.getInstanceLogin().getEmail(), email);
		
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();

		input_values(pom.getInstanceLogin().getPassword(), password);

		click_Element(pom.getInstanceLogin().getSubmit());

		click_Element(pom.getInstanceCollection().getWomen_Section());

		click_Element(pom.getInstanceItem().getItem_selection());

		Frames_WebElement(pom.getInstanceDress().getFrame());

		click_Element(pom.getInstanceDress().getDress_Quantity());
		
		String index = File_Reader_Manager.getInstanceFRM().getInstanceCR().getIndex();
		
		String qty = File_Reader_Manager.getInstanceFRM().getInstanceCR().getQty();

		selectby(pom.getInstanceDress().getDress_Size(), index, qty);

		click_Element(pom.getInstanceDress().getDress_Colour());

		click_Element(pom.getInstanceDress().getAddCart());

		default_Content();

		click_Element(pom.getInstanceCheckout().getCheckout());

		click_Element(pom.getInstanceCheckout1().getCheckout1());

		click_Element(pom.getInstanceCheckout2().getCheckout2());

		click_Element(pom.getInstanceCheckout3().getAgree_Terms());

		click_Element(pom.getInstanceCheckout3().getCheckout3());
		
		String screenshot = File_Reader_Manager.getInstanceFRM().getInstanceCR().getScreenshot();

		screenshot(screenshot);

	}

}
