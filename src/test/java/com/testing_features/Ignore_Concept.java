package com.testing_features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	
    @Test(priority=-5, invocationCount=3)
	public void potato() {

		System.out.println("potato");
	}
    @Test(priority=-4)
	public void carrot() {
		System.out.println("carrot");
	}
    @Ignore
    @Test
	public void tomato() {
		System.out.println("tomato");
	}
    @Test(enabled=false)
	public void apple() {
		System.out.println("apple");
	}
    @Test(priority=-3)
	public void orange() {
		System.out.println("orange");
	}
	
}
