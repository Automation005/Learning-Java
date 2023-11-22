package com.Revision_Day_12;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class_Assig {
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@BeforeMethod
	public void registration() {
		  
	        options = new ChromeOptions();
		    options.setPageLoadStrategy(PageLoadStrategy.EAGER); //EAGER, NORMAL, NONE
			options.addArguments("--start-maximized");
			options.addArguments("--incognito");
			options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
			WebDriver driver = new ChromeDriver(options);
		    driver.get("https://tutorialsninja.com/demo");
		    driver.findElement(By.linkText("My Account")).click();
		    driver.findElement(By.linkText("Register")).click();
		  
		
	}
	
	@Test (priority = 1)
     public void verifyRegistraionWithMandatoryDetails() {
		
		driver.findElement(By.id("input-firstname")).sendKeys("Mohammed");
		driver.findElement(By.id("input-lastname")).sendKeys("automation");
		driver.findElement(By.id("input-email")).sendKeys("mohyyuee@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("879759574");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Moh123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("moh123");
		driver.findElement(By.xpath("//label[normalize-space()='Yes']//input[@name='newsletter']")).click();
		driver.findElement(By.cssSelector("input[name=agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}
	  
	@Test (priority = 2)
    public void verifyWithExistingEmailId() {
		
	}
	@Test (priority = 3)
    public void verifyWithNoDetail() {
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
		
	}
	
	
}
