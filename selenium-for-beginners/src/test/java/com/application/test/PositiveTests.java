package com.application.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTests {
	
	@Test
	public void loginTest()
	{
		//  Create driver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaurish\\Desktop\\Selenium_Training\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 
		 String url="http://the-internet.herokuapp.com/login";
		 
		 driver.get(url);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 System.out.println("page opened");
		 
		 WebElement userName=driver.findElement(By.id("username"));
		 userName.sendKeys("tomsmith");
		 
		 WebElement passWord=driver.findElement(By.id("password"));
		 passWord.sendKeys("SuperSecretPassword!");
		 
		 WebElement loginButton=driver.findElement(By.tagName("button"));
		 loginButton.click();
		 
		 
		 
		 
		 //Verifications
		 	String expectedUrl="http://the-internet.herokuapp.com/secure";
		 	String actualUrl=driver.getCurrentUrl();
		 	Assert.assertEquals(actualUrl, expectedUrl,"Acutal url is not same as expected");
		 	
		 	WebElement logOutButton=driver.findElement(By.xpath("//a[@class='button secondary radius']"));
			 
			 WebElement successMessage=driver.findElement(By.cssSelector("#flash"));
		 	Assert.assertTrue(logOutButton.isDisplayed(), "logout button is not displayed");
		 	
		 	String expectedMessage="You logged into a secure area!";
		 	String actualMessage=successMessage.getText();
		 	
		 	Assert.assertTrue(actualMessage.contains(expectedMessage),
		 	"Actual message doesnot contain expected message\n Actual message is:"+actualMessage +"\nexpectedMessage is:" +expectedMessage);
		
		 	driver.quit();
	}

}
