package com.applications.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueExample {
	
	@Test
	public void assertTrueTest1()
	{
		Assert.assertTrue(checkBigger(1,5),"First number is smaller than second");
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
	
	@Test
	public void assertTrueTest2()
	{
		Assert.assertFalse(checkBigger(1,5),"First number is smaller than second");
	}

}
