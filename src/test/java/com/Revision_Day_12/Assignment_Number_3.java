package com.Revision_Day_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_Number_3 {

	
	public WebDriver driver;
	public ChromeOptions options;
	
	
	@BeforeMethod
	public void setup() { 
		driver = new ChromeDriver();
		options.addArguments("--headless");  // check why not working 
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
	}
	@Test (priority=1)
	public void searchWithValidProdud() {
		driver.findElement(By.cssSelector("input.form-control.input-lg")).sendKeys("hp");	
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();	
		
	}
	@Test (priority=2)
	public void searchwithInvalidProduct() {
		driver.findElement(By.cssSelector("input.form-control.input-lg")).sendKeys("dell");
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();			
		
		
	}
	
	@Test(priority = 3)
	public void searchWithNoProduct() {
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg")).click();		
	
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}


