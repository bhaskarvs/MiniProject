package com.testing_features;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept2 {
	
	@Test
	public void demo() {

		String exp = "b1234";
		String act = "b1345";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(exp,act);
		
		System.out.println("verification");
	}

}
