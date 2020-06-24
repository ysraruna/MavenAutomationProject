package com.application.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.application.base.TestBase;

public class Annotations extends TestBase{
	
	@BeforeClass
	public void beforeClassMethod()
	{
		System.out.println("Before class is:");
	}
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Before method :");
	}
	
	@Test
	public void testMethod1()
	{
		System.out.println("test method 1:");
	}
	
	@Test
	public void testMethod2()
	{
		System.out.println("test method 2:");
	}
	@Test
	public void testMethod3()
	{
		System.out.println("test method 3:");
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method is:");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class is:");
	}

}
