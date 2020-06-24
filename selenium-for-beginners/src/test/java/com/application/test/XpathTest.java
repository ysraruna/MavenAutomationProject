package com.application.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class XpathTest {
	
	WebDriver driver;
	
	@BeforeMethod
	private void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaurish\\Desktop\\Selenium_Training\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();		 	
	}
	@Test
	public void validateXpaths()
	{
		String url="http://the-internet.herokuapp.com/login";
	}

}
