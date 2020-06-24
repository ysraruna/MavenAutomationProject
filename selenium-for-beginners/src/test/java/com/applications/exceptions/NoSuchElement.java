package com.applications.exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NoSuchElement {
	
	WebDriver driver;

	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaurish\\Desktop\\Selenium_Training\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();	
		
	}
	
	@Test
	public void staleElement()
	{
	
	 driver.get("https://learn.letskodeit.com/p/practice");  
     
     driver.manage().window().maximize();  
       
     //Clicking on the Hide button  
     driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();  
                 
     driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("text123");;  
	}
}
