package com.Data_Driven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Data_Provider_Diff_Class {
	public WebDriver driver;

	@Test (dataProvider ="login", dataProviderClass = Data_Provider_TN.class)
		
		public void TutorilasNijna_LogIn(String email, String password) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo");
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.id("input-email")).sendKeys(email);
			driver.findElement(By.id("input-password")).sendKeys(password);
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click()	;
	}

		
		
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}


