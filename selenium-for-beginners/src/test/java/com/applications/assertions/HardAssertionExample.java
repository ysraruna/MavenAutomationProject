package com.applications.assertions;

import org.junit.Assert;
import org.testng.annotations.Test;

public class HardAssertionExample {
	
	@Test
	public void myTest1()
	{
		try
		{
			Assert.assertTrue(checkBigger(10,5));
		}
		catch(Throwable t)
		{
			System.out.println("end of my test case");
		}
	}
	
	@Test
	public void myTest2()
	{
		Assert.assertTrue(checkBigger(10,5));
//		System.out.println("end of my test case");
	}
	
	public boolean checkBigger(int x,int y)
	{
		boolean results;
		if(x>y)
		{
			results=true;
			
		}
		else
		{
			results=false;
		}
		return results;
	}

}
