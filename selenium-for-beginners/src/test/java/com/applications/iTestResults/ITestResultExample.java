package com.applications.iTestResults;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ITestResultExample {
	
	@Test
	public void myTestA()
	{
		System.out.println("This is myTestA method");
		Assert.assertTrue(true);
	}
	
	@Test
	public void myTestB()
	{
		System.out.println("This is myTestB method");
		Assert.assertTrue(false);
	}
	
	@AfterMethod
	public void getStatusResults(ITestResult myTestStatus)
	{
		if(myTestStatus.getStatus()==ITestResult.SUCCESS)
		{
			System.out.println("Pass : MethodName is"+myTestStatus.getMethod().getMethodName());
		}
		else if(myTestStatus.getStatus()==ITestResult.SUCCESS)
		{
			System.out.println("Pass : MethodName is"+myTestStatus.getMethod().getMethodName());
		}
		{
			
		}
	}

}
