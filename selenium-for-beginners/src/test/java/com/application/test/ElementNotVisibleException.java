package com.application.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementNotVisibleException {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaurish\\Desktop\\Selenium_Training\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();	
	}
	
	@Test
	public void elemnetNotVisibleTest(){
		
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		
		WebElement start=driver.findElement(By.id("start"));
		WebElement finishElement=driver.findElement(By.id("finish"));
		start.click();
		
		String expectedResults="Hello World!";
		String actualResults=finishElement.getText();
		
		Assert.assertTrue(actualResults.contains(expectedResults),"both results are not same");
	}
	

}
