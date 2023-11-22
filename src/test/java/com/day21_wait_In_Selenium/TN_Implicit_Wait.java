package com.day21_wait_In_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TN_Implicit_Wait {
	public ChromeDriver driver;
	public WebDriverWait wait;
	
	
	 @Test
	 public void tnImplicitWait() {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		 
	 }
	 @Test(priority=2)
	 public void tnExplicitWebDriverWaitTest() throws Exception {
	 //I want my Explicit wait to be smart as well.
	 //Thread.sleep(nnnn) is not smart. It is rigid.
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://tutorialsninja.com/demo");

	 //Step 1: Create the Object of WebDriverWait Class
	 //Step 2: In the constructor you have to pass 2 parameters - driver reference, the other one is Duration class

	 wait = new WebDriverWait(driver, Duration.ofSeconds(10));


	 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("My Account"))).click();

	 //driver.findElement(By.linkText("My Account")).click(); //Let's say My Account is misbehaving

	 WebElement loginDropdownOption = driver.findElement(By.linkText("Login"));
	 wait.until(ExpectedConditions.elementToBeClickable(loginDropdownOption)).click();
	 
	 driver.findElement(By.id("input-email")).sendKeys("seleniumpanda123@gmail.com");
	 wait.until(ExpectedConditions.elementToBeClickable(loginDropdownOption)).click();
	 driver.findElement(By.id("input-password")).sendKeys("seleniumpanda@123");
	
	 
	 
	 
	 
	 
	 
	 
	 

}
}