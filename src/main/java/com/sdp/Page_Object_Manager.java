package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Checkout;
import com.pom.Checkout1;
import com.pom.Checkout2;
import com.pom.Checkout3;
import com.pom.Dress_Selection;
import com.pom.Home_Page;
import com.pom.Item_Selection;
import com.pom.Login_page;
import com.pom.Women_Section;
import com.pom.Women_Section;

public class Page_Object_Manager {
	

	public WebDriver driver;

	private Home_Page home;

	private Login_page login;

	private Women_Section collection;

	private Item_Selection item;

	private Dress_Selection dress;

	private Checkout proceed;

	private Checkout1 proceed1;

	private Checkout2 proceed2;

	private Checkout3 proceed3;

	public Page_Object_Manager(WebDriver driver2) {

		this.driver = driver2;
	}

	public Home_Page getInstanceHome() {

		if (home == null) {
			home = new Home_Page(driver);
		}
		return home;

	}

	public Login_page getInstanceLogin() {

		if (login == null) {

			login = new Login_page(driver);
		}

		return login;
	}

	public Women_Section getInstanceCollection() {

		if (collection == null) {

			collection = new Women_Section(driver);
		}
		return collection;
	}

	public Item_Selection getInstanceItem() {

		if (item == null) {
			item = new Item_Selection(driver);

		}

		return item;
	}

	public Dress_Selection getInstanceDress() {

		if (dress == null) {

			dress = new Dress_Selection(driver);

		}
		return dress;

	}

	public Checkout getInstanceCheckout() {

		if (proceed == null) {
			proceed = new Checkout(driver);

		}
		return proceed;

	}

	public Checkout1 getInstanceCheckout1() {

		if (proceed1 == null) {

			proceed1 = new Checkout1(driver);
		}
		return proceed1;
	}

	public Checkout2 getInstanceCheckout2() {

		if (proceed2 == null) {
			proceed2 = new Checkout2(driver);
		}
		return proceed2;

	}

	public Checkout3 getInstanceCheckout3() {
		if (proceed3 == null) {
			proceed3 = new Checkout3(driver);
		}
		return proceed3;

	}

}


