package com.OOPS_Method_in_Java;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Chrome_Options {
	
	public WebDriver driver; //creating the object of ChromeOption class
	  @Test
	  public void Setup() {
		  ChromeOptions options = new ChromeOptions();
		    options.setPageLoadStrategy(PageLoadStrategy.EAGER); //EAGER, NORMAL, NONE
			options.addArguments("--start-maximized");
			options.addArguments("--incognito");
			options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
			WebDriver driver = new ChromeDriver(options);
		  driver.get("https://tutorialsninja.com/demo");
		  driver.findElement(By.linkText("My Account")).click();
		  driver.findElement(By.linkText("Login")).click();
		  
		  
		  
	  }
	@AfterMethod
	public void tearDown() {
		
	}

	


	}


