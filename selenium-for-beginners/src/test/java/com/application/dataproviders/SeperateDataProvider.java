package com.application.dataproviders;

import org.testng.annotations.DataProvider;

public class SeperateDataProvider {
	
		
	@DataProvider(name="numberInputs")
	public Object[][] getDataFromProvider()
	{
		Object[][] data={{2,3},{3,4}};
		return data;
		
	}

}
