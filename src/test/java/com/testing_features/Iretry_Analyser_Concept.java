package com.testing_features;

import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;

import junit.framework.Assert;

public class Iretry_Analyser_Concept {

	@Test
	public void login() {

		String exp_Username = "Bhaskar";

		String act_Username = "Bhaskar";

		Assert.assertEquals(act_Username, exp_Username);

	}
	@Test
	public void login2() {

		String exp_Password = "bhas";

		String act_Password = "bas";

		Assert.assertEquals(act_Password, exp_Password);

	}

}
