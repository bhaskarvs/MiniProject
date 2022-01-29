package com.testing_features;

import org.testng.annotations.Test;

public class Dependency_Concept {
	
	@Test
	public void tenth() {

		System.out.println("tenth");
	}
	@Test(dependsOnMethods = "tenth")
	public void twelth() {

		System.out.println("twelth");
	}
	
	

}
