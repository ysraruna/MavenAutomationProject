package com.application.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DepenedsonSingle {
	
	@Test(dependsOnMethods="testB")
	public void testA()
	{
		System.out.println("test A");
//		Assert.assertTrue(false);
		
	}
	
	@Test
	public void testB()
	{
		System.out.println("test B");
		Assert.assertTrue(false);
		
	}
	
	@Test(dependsOnMethods="testD")
	public void testC()
	{
		System.out.println("test C");
	}
	@Test
	public void testD()
	{
		System.out.println("test D");
	}

}
