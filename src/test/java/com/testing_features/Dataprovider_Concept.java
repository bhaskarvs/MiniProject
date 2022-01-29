package com.testing_features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Concept {
	
	
	@Test(dataProvider="inputData")
	public void credentials(String username, String password) {
		
		
		System.out.println("username is:"+username);
		
		System.out.println("password is:"+password);
		
	}
	
	@DataProvider //object 2D array return type -predefined one
    public Object[][] inputData() {
		
		return new Object[][] {
			
			{"bhaskar","bhas123"},
			
			{"jayasheelan","jai123"}
			
		
		};
		
		
	}}

		
	

