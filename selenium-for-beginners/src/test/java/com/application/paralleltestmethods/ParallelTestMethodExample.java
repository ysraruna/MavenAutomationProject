package com.application.paralleltestmethods;

import org.testng.annotations.Test;

public class ParallelTestMethodExample {
	
	@Test(threadPoolSize=4,invocationCount=8)
	public void testCase1()
	{
		System.out.println("Test case1 with threa id is:"+Thread.currentThread().getId());
	}

}
