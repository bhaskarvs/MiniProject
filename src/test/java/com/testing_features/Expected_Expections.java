package com.testing_features;

import org.testng.annotations.Test;

public class Expected_Expections {
	
	
	
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void demo() {

		int age =25;
		System.out.println(age/0);
	}

}
