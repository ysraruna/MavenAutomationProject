package com.applications.exceptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NoSuchWindowException {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaurish\\Desktop\\Selenium_Training\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();	
	}
	
	@Test
	public void staleElementReference(){
		
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.close();
		
		
		driver.quit();
	}

}
