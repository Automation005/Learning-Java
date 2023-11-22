package com.Data_Driven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_TL {
	public WebDriver driver;
	
	
	
	@Test(dataProvider = "login")
	public void TutorilasNijna_LogIn(String email, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("MyAccount")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click()	;
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	@DataProvider
	public Object[][] login() {
		Object [][] login = {{"seleniumpanda@gmail.com" , "Selenium@123"},
				             {"seleniumpanda1@gmail.com" , "Selenium@123"},
				             {"seleniumpanda2@gmail.com" , "Selenium@123"},
				             {"seleniumpanda3@gmail.com" , "Selenium@123"},
				             {"seleniumpanda4@gmail.com" , "Selenium@123"},
				             {"seleniumpanda5@gmail.com" , "Selenium@123"},
				             {"seleniumpanda6@gmail.com" , "Selenium@123"}};
		
		return login; 
				
		}
	}


