package com.epam.mentoring.calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSubLong extends BaseTest{

	@DataProvider(name="values")
	public Object[][] value() {
	return new Object[][] {
		{0,0,0},
		{9, 3,6},
		{10000, 100,9900},
		{-8, -8,0},
		{ 1, 9000,-8999},
		};
	}
		
	@Test(dataProvider="values",groups = "demogroup")
	public void subLongTest(long a, long b,long c)
	{
		long result = calc.sub(a, b);
		Assert.assertEquals(result, c);
		
		
	}
}