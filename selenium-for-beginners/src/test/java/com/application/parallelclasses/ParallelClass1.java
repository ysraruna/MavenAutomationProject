package com.application.parallelclasses;

import org.testng.annotations.Test;

public class ParallelClass1 {
	
	@Test
	public void testCase1()
	{
		System.out.println("Running test case1 with ThreadID:"+Thread.currentThread().getId());
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("Running test case2 with ThreadID:"+Thread.currentThread().getId());
	}
	@Test
	public void testCase3()
	{
		System.out.println("Running test case3 with ThreadID:"+Thread.currentThread().getId());
	}
	@Test
	public void testCase4()
	{
		System.out.println("Running test case4 with ThreadID:"+Thread.currentThread().getId());
	}

}
