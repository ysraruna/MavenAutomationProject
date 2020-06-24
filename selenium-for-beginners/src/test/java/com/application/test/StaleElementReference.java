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

public class StaleElementReference {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaurish\\Desktop\\Selenium_Training\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();	
	}
	
	@Test
	public void staleElementReference(){
		
		driver.get("http://the-internet.herokuapp.com/dynamic_controls");
		driver.manage().window().maximize();
		
		WebElement checkbox=driver.findElement(By.id("checkbox"));
		WebElement removeButton=driver.findElement(By.xpath("//button[contains(text(),'Remove')]"));
		WebDriverWait wait=new WebDriverWait(driver,10);
		removeButton.click();
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		
	}


}
