package com.applications.assertions;

import org.testng.annotations.Test;

public class TimeOutInMethods {
	
	@Test(timeOut=1000)
	public void test1() throws InterruptedException
	{
		System.out.println("Running my Test1:");
		Thread.sleep(4000);
		System.out.println("Ending my test1");
	}
	
	@Test
	public void test2() throws InterruptedException
	{
		System.out.println("Running my Test2:");
		Thread.sleep(6000);
		System.out.println("Ending my test2");
	}

}
