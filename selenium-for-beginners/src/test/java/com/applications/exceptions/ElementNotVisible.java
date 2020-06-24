package com.applications.exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
	
	@Test(priority=1,enabled=false)
	public void staleElement()
	{
	
	 driver.get("https://learn.letskodeit.com/p/practice");  
     
     driver.manage().window().maximize();  
       
     //Clicking on the Hide button  
     driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();  
                 
     driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("text123"); 
	}
	
	@Test(priority=1,enabled=false)
	public void hiddenElementsFix()
	{
		  driver.get("https://learn.letskodeit.com/p/practice");  
		             
		           driver.manage().window().maximize();  
		             
		           //Clicking on the Hide button  
		           driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();  
		                       
		           JavascriptExecutor js = (JavascriptExecutor)driver;  
		             
		           // Identifying the element using ID attribute and Entering the value in the text box  
		           js.executeScript("document.getElementById('displayed-text').value='text123'");  
	}
	
	@Test(priority=1)
	public void hiddenElement2()
	{
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();  
		driver.findElement(By.id("female")).click();
		
	}
}
