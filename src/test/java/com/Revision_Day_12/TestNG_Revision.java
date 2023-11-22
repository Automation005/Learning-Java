package com.Revision_Day_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Revision {

	public WebDriver driver;

	@BeforeMethod
	public void Setup() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		
	}
	@Test (priority=1)
	public void verifyLoginWithValidCredentils() {
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda123@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	@Test (priority=2)
	public void verifyLoginWithInvalidCredentils() {
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda123efee@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@12aad3");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			
		}
	@Test (priority=3)
	public void verifyLoginWithValidEmailAndInvalidPassword() {
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda123@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@12aad3");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();	
		
	}
	
	@Test (priority=4)
	public void verifyWithoutCreditials() {
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
		
	}
	
}
