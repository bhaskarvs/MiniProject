package com.testing_features;

import org.testng.annotations.Test;

public class Grouping {

	
	@Test(groups="fruits")
	public void apple() {
		System.out.println("apple");

	}
	@Test(groups="fruits")
	public void banana() {
		System.out.println("banana");

	}
	@Test(groups="fruits")
	public void orange() {

		System.out.println("orange");

	}
	@Test(groups="vegetables")
	public void onion() {
		System.out.println("onion");
	}
	@Test(groups="vegetables")
	public void carrot() {
		System.out.println("carrot");
	}
	@Test(groups="vehicle")
	public void car() {
		System.out.println("car");

	}
	@Test(groups="vehicle")
	public void bike() {
		System.out.println("bike");

	}

}
