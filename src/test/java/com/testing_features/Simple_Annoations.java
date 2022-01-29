package com.testing_features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annoations {

	@BeforeSuite
	public void property() {
		System.out.println("property");
	}

	@BeforeTest
	public void browser() {
		System.out.println("browser");
	}

	@BeforeClass
	public void url() {
		System.out.println("url_launch");

	}

	@BeforeMethod
	public void signin() {
		System.out.println("signin");
	}

	@Test
	public void women() {
		System.out.println("women");

	}

	@Test
	public void men() {

		System.out.println("men");

	}

	@Test
	public void kids() {

		System.out.println("kids");

	}

	@AfterMethod
	public void signout() {
		System.out.println("signout");
	}

	@AfterClass
	public void homepage() {
		System.out.println("homepage");

	}

	@AfterTest
	public void deleteCookies() {
		System.out.println("deleteCookies");

	}

	@AfterSuite
	public void close() {
		System.out.println("close");
	}
}
