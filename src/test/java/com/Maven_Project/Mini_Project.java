//package com.Maven_Project;
//
//import java.io.File;
//import java.io.IOException;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//
//import com.pom.Checkout;
//import com.pom.Checkout1;
//import com.pom.Checkout2;
//import com.pom.Checkout3;
//import com.pom.Dress_Selection;
//import com.pom.Home_Page;
//import com.pom.Item_Selection;
//import com.pom.Login_page;
//import com.pom.Women_Collection;
//import com.sdp.Page_Object_Manager;
//
//public class Mini_Project extends Base_Class {
//	
//		
//		public static WebDriver driver= browserLaunch("Chrome");//null
//
//	    public static  Page_Object_Manager pom =new Page_Object_Manager(driver);
//
//		public static void main(String[] args) throws InterruptedException, IOException {
//
//
//			launch_Url("http://automationpractice.com/");
//
//			timewait(15);
//
////			WebElement sign_in = driver.findElement(By.xpath("//a[@title=\"Log in to your customer account\"]"));
//
//			Home_Page hp = new Home_Page(driver);
//			click_Element(hp.getSign_in());
//
////			WebElement mail_id = driver.findElement(By.xpath("(//input[@data-validate=\"isEmail\"])[2]"));
//
//			Login_page lp = new Login_page(driver);
//
//			input_values(lp.getMail_id(), "bhaskaraero97@gmail.com");
//
////			WebElement Password = driver.findElement(By.xpath("//input[@data-validate=\"isPasswd\"]"));
//			input_values(lp.getPassword(), "Tester");
//
////			WebElement sign_in1 = driver.findElement(By.id("SubmitLogin"));
//			click_Element(lp.getSign_in1());
//
////			WebElement Women_collections = driver.findElement(By.xpath("//a[@title=\"Women\"]"));
//
//			Women_Collection wc = new Women_Collection(driver);
//			click_Element(wc.getWomen_collections());	
//
////			WebElement Item_selection = driver.findElement(By.xpath("(//img[@title=\"Faded Short Sleeve T-shirts\"])[1]"));
//
//			Item_Selection is = new Item_Selection(driver);
//			click_Element(is.getItem_selection());
//
//			// Handle Frame
//
////			WebElement Frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
//
//			Dress_Selection ds = new Dress_Selection(driver);
//
//			Frames_WebElement(ds.getFrame());
//
//			// select quantity
//
//			int i = 1;
//
//			while (i < 4)
//
//			{
////				WebElement Quantity_Selection = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
//
//				click_Element(ds.getQuantity_Selection());
//
//				i++;
//			}
//
//			// select size
////			WebElement Dress_Size = driver.findElement(By.xpath("//select[@id='group_1']"));
//
//			Select s = new Select(ds.getDress_Size());
//
//			s.selectByIndex(1);
//
//			// choose colour
//
////			WebElement Colour_Selection = driver.findElement(By.xpath("//a[@name='Blue']"));
//			click_Element(ds.getColour_Selection());
//
////			WebElement Add_Cart = driver.findElement(By.xpath("//button[@class='exclusive']"));
//			click_Element(ds.getAdd_Cart());
//
//			// back to frame
//
//			default_Content();
//
//			// proceed to checkout
//
////		      WebElement Checkout = driver.findElement(By.xpath("//a[@class='btn btn-default button button-medium']"));
//
//			Checkout c = new Checkout(driver);
//			click_Element(c.getCheckout());
//
//			// proceed to checkout1
//
////	     	WebElement checkout1 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
//
//			Checkout1 c1 = new Checkout1(driver);
//
//			click_Element(c1.getCheckout1());
//
//			// proceed to checkout2
//
////			WebElement Checkout2 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]"));
//
//			Checkout2 c2 = new Checkout2(driver);
//
//			click_Element(c2.getCheckout2());
//
//			// Click checkout3 Agree_Terms
//
////			WebElement Agree_Terms = driver.findElement(By.xpath("//input[@type='checkbox']"));
//
//			Checkout3 c3 = new Checkout3(driver);
//
//			click_Element(c3.getAgree_Terms());
//
//			// proceed to checkout3
//
////			WebElement Checkout3 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
//			click_Element(c3.getCheckout3());
//
//			// TakeScreenshot
//			TakesScreenshot ts = (TakesScreenshot) driver;
//
//			File Source = ts.getScreenshotAs(OutputType.FILE);
//
//			File designation = new File(
//					"C:\\Users\\SUBHA\\eclipse-workspace\\Maven_Project\\Screenshot\\mini_project1.png");
//
//			FileUtils.copyFile(Source, designation);
//
//		}
//}
//		
//
