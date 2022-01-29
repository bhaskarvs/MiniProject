package com.testing_features;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept1 {
	
     @Test
     @Parameters({"UserId", "Password"})
	public void forgotPassword(String UserId,String Password)
     {
    	 System.out.println("userId is:"+UserId);
 		System.out.println("password is :"+Password);

	}

}
