package com.Tutoring_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ChooseAProduct {
	WebDriver driver;
	SoftAssert softassert = new SoftAssert ();
	
	
	@Test 
	public void startChoosingProduct() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://saucedemo.com");
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
	    driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
	    driver.findElement(By.cssSelector("input#login-button")).click();
	  //a[@id='item_4_title_link']
	  //div[normalize-space()='Sauce Labs Backpack']
	  //div[text()='Sauce Labs Backpack']
	}
	
	

}
