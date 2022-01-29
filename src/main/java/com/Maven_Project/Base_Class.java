package com.Maven_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver; // null driver

//	browserLaunch
	public static WebDriver browserLaunch(String name) {

		if (name.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.manage().window().maximize();

		}

		else if (name.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.manage().window().maximize();

		}
		return driver;
	}

//	launch_Url
	public static void launch_Url(String Url) {

		driver.get(Url);
	}

//	timewait (implicitlyWait)
	public static void timewait(int sec) {

		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

//	click
	public static void click_Element(WebElement element) {
		
      element.click();
	}

//	sendKeys
	public static void input_values(WebElement element, String name) {
		element.sendKeys(name);

	}

//	close 
	public static void close() {

		driver.close();

	}

//	quite
	public static void quit() {

		driver.quit();
	}

//	Navigate to	
	public static void navigate_url(String url) {

		driver.navigate().to(url);

	}

	// navigate back
	public static void navigate_back() {

		driver.navigate().back();
	}

	// navigate forward
	public static void navigate_forward() {

		driver.navigate().forward();
	}

	// navigate refresh

	public static void navigate_refresh() {

		driver.navigate().refresh();
	}

//	frames by passsing Index
	public static void Frames_Index(int Index) {

		driver.switchTo().frame(Index);

	}

//	frames by passsing webelement
	
	public static void Frames_WebElement(WebElement element) {

		driver.switchTo().frame(element);

	
	}
	
	
//	frames by passsing name
	
	public static void Frames_Name(String name) {

		driver.switchTo().frame(name);

	}
	
//	frames by passsing ID
	
	public static void Frames_id(String id) {

		driver.switchTo().frame(id);

	}
	
//	defaultContent back to frame concept
	
	public static void default_Content() {

		driver.switchTo().defaultContent();

	}
	
//	getTitle

	public static void getTitle() {

		String title = driver.getTitle();
		System.out.println(title);
	}

//	getCurrentUrl

	public static void getCurrentUrl() 
	{
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

//Robot class keyboard Function pressing DOWNKEY FUNCTION

	public static void KeyDown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	// Robot class keyboard Function pressing UPKEY FUNCTION

	public static void keyUp() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

//	click -using action class

	public static void click(WebElement element) {

		Actions ac = new Actions(driver);
		ac.click(element).build().perform();
	}

	// Right_Click-using action class

	public static void rightClick(WebElement element) {

		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	}

	// Double _click -using action class

	public static void double_Click(WebElement element ) {
		Actions ac = new Actions(driver);

		ac.doubleClick(element).build().perform();

	}

//	moveToElement-using action class

	public static void moveToElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();

	}
	
	
//	dragAndDrop
	
	public static void dragAndDrop(WebElement source, WebElement target ) 
	{

		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).build().perform();
	}
	

	// multiple drop down_ isMutiple() method using select class
	
	public static void isMultiple(WebElement element) {
		Select m = new Select(element);
		boolean multiple = m.isMultiple();
		System.out.println(multiple);

	}

	// multiple drop down_ getAllSelectedOptions() method using select class

	public static void getAllSelectedOptions(WebElement element)

	{
		Select m = new Select(element);

		m.getAllSelectedOptions();

	}
	// multiple drop down_ getOptions() method using select class

	public static void getOptions(WebElement element) {
		Select m = new Select(element);
		m.getOptions();

	}
	// multiple drop down_ getFirstSelectedOption() method using select class

	public static void getFirstSelectedOption(WebElement element) {

		Select m = new Select(element);
		m.getFirstSelectedOption();

	}
	// multiple drop down_ deselectAll() method using select class

	public static void deselectAll(WebElement element) {

		Select m = new Select(element);
		m.deselectAll();

	}
	
	// multiple drop down_ deselectByValue() method using select class

	public static void deselectByValue(WebElement element, String num) {

		Select m = new Select(element);
		m.deselectByValue(num);

	}

//	alert -simple_alert-method
	public static void simpleAlert() {
		driver.switchTo().alert().accept();

	}

//	alert-confirm_alert-method (dismiss
	public static void confirmAlert() {

		driver.switchTo().alert().dismiss();
	}

//	alert-Prompt_alert-method(sendkeys, accept)

	public static void promptAlert(String name) {
		driver.switchTo().alert().sendKeys(name);
		driver.switchTo().alert().accept();		
	
	}
	
//dropdown
	 public static  void selectby(WebElement ele, String type, String value)
	{
		
		Select s = new Select(ele);
		
		if(type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}else if (type.equalsIgnoreCase("visible text")) {
			s.selectByVisibleText(value);
		}else if(type.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}
	
	}
	public static void screenshot( String pathname) throws IOException {
		

		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File Source = ts.getScreenshotAs(OutputType.FILE);
		
		File designation = new File(pathname);
	
		FileUtils.copyFile(Source, designation);
		
         
	}

}
