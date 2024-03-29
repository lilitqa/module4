package com.epam.mentoring.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSum extends BaseTest{

	@DataProvider(name="values")
	public Object[][] value() {
	return new Object[][] {
		{0,0,0},
		{9, 3,12},
		{0.56644, 2.115,2.68144},
		{10000.0, 100.0,10100},
		{-8, 2.4,-5.6},
		{-8, -8,-16},
		{ 1, 9000,9001},
		{ 2.70005, 1.3,4.00005},
		};
	}
		
	@Test(dataProvider="values",groups = "demogroup")
	public void sumTest(double a, double b,double c)
	{
		double result = calc.sum(a, b);
		Assert.assertEquals(result, c, 0.001);
		
		
	}

}