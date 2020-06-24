package com.applications.exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumExceptions {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaurish\\Desktop\\Selenium_Training\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();	
	}
	
	@Test(priority=1,enabled=false)
	public void noSuchWindow()
	{
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.switchTo().window("Yup_Fail");
		
	}
	
	@Test(priority=2,enabled=false)
	public void noSuchFrame()
	{
		driver.get("http://google.com");
		driver.switchTo().frame("F_fail");
	}
	
	@Test(enabled=false)
	public void noSuchElementException()
	{
		driver.get("https://learn.letskodeit.com/");
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		
//		driver.findElement(By.id("user_email")).sendKeys("aruna.com");
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement email=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
		email.sendKeys("ysraruna@gmail.com");
		
	}
	
	@Test(enabled=false)
	public void iframeNoSuchElementException()
	{
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.switchTo().frame("courses-iframe");
		driver.findElement(By.id("search-courses")).sendKeys("java");
	}
	
	@Test(priority=4,enabled=false)
	public void noAlertPresent()
	{
		driver.get("http://google.com");
		driver.switchTo().alert().accept();
	}
	
	@Test(priority=5,enabled=false)
	public void webDriverException()
	{
		driver.get("http://google.com");
		driver.close();
		driver.quit();
	}
	
	@Test(priority=1)
	public void elementNotClickable()
	{
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'Search for Bus')]")).click();
		
		
	}
	
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}
	

}
