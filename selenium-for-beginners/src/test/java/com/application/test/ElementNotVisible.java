package com.application.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ElementNotVisible {
	
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
		driver.manage().window().maximize();
		
		WebElement start=driver.findElement(By.xpath("//div[@id='start']/button"));
		start.click();
		WebElement finishElement=driver.findElement(By.id("finish"));
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(finishElement));
		String expectedResults="Hello World!";
		String actualResults=finishElement.getText();
		System.out.println("actual results is:"+actualResults);
		
		Assert.assertTrue(actualResults.contains(expectedResults),"\n actual results are "+actualResults +"not equals to expected results"+expectedResults);
//		start.click();
	}
	

}
