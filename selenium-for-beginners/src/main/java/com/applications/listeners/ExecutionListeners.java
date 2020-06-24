package com.applications.listeners;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.IExecutionListener;

public class ExecutionListeners implements IExecutionListener{
	
	/**
	 * 
	
	
	private long startTime;
	private long endTime;

	@Override
	public void onExecutionStart() {
		
		System.out.println("TestNG is going start test suites execution");
		startTime=System.currentTimeMillis();
		String timeStamp=new SimpleDateFormat("yyyy/mm/dd HH:MM:SS").format(Calendar.getInstance().getTime());
		System.out.println("testng is started at :"+timeStamp);
	}

	@Override
	public void onExecutionFinish() {
		System.out.println("TestNG as finished execution of test suites:"+System.currentTimeMillis());
		
		endTime=System.currentTimeMillis();
		String timeStamp=new SimpleDateFormat("yyyy/mm/dd HH:MM:SS").format(Calendar.getInstance().getTime());
		System.out.println("test finished:"+timeStamp);
		
	}
	
	 */

}
