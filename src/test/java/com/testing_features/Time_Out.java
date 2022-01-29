package com.testing_features;

import org.testng.annotations.Test;

public class Time_Out {
	
	
	@Test(timeOut = 7000)
public void demo() throws InterruptedException {
	// TODO Auto-generated method stub

    Thread.sleep(2000);
	System.out.println("Browser Launch");
	
	Thread.sleep(1000);
	System.out.println("Url Launch");
	
	Thread.sleep(3000);
	System.out.println("Click Login");

	
	
}

}
