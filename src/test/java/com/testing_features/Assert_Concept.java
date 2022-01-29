package com.testing_features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Concept {
	@Test
	public void demo_Username() {

		String exp = "Bhaskar";
		
		String act ="Bhaskar";
		
		Assert.assertEquals(exp, act);
		
		System.out.println("validation");
		
	}

}
