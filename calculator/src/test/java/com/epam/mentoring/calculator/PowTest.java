package com.epam.mentoring.calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
	
	public class PowTest extends BaseTest {

		@DataProvider(name="values")
		public Object[][] value() {
		return new Object[][] {
			{0,0,1},
			{2, 3, 8},
			{-5, 2, 25},
			{10, -1, 0.1},
			};
		}
			
		@Test(dataProvider="values",groups = "demogroup")
		public void powTest(double a, double b,double c)
		{
			double result = calc.pow(a,b);
			Assert.assertEquals(result, c, 0.001);
		}

	}



