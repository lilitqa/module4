package com.epam.mentoring.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CtgTest extends BaseTest {
	
		
	@Parameters({"ctg","ctgValue"})
	@Test(groups = "demogroup")
	public void ctgTest(@Optional(value= "30")  double a,@Optional(value= "1.7321")  double b)
	{
		double result = calc.ctg(a);
		Assert.assertEquals(result, b, 0.0001);
	}

}
