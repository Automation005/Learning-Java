package com.Revision_Day_12;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Testing {

public static ChromeOptions options;
public static WebDriver driver;


	public static void main(String []args) {
		options = new ChromeOptions();
	    options.setPageLoadStrategy(PageLoadStrategy.EAGER); //EAGER, NORMAL, NONE
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
		WebDriver driver = new ChromeDriver(options);
	    driver.get("https://tutorialsninja.com/demo");
	    driver.findElement(By.linkText("My Account")).click();
	    driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input[name=firstname]")).sendKeys("yacine");
		driver.findElement(By.cssSelector("input[name=lastname]")).sendKeys("ben");
		String actualAccountSuccessMessage = driver.findElement(By.xpath("//div[@id = 'content']/child::p[1]")).getText();
		String expectedAccountSuccessMessage = "Congratulations! Your new account has been successfully created!";
		Assert.assertTrue(actualAccountSuccessMessage.contains(expectedAccountSuccessMessage));
	}
	
	
	
		
}