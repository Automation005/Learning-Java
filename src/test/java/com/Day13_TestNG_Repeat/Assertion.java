package com.Day13_TestNG_Repeat;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assertion {
	public WebDriver driver;
	
	@BeforeMethod
	public void rediffLogIn() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.linkText("Sign in")).click();
		
	
	}
		
	@Test (priority =1 )
	public void validCredintils() {
	driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda1@rediffmail.com");
	driver.findElement(By.cssSelector("input#password")).sendKeys("Donkey@123");
	driver.findElement(By.className("signinbtn")).click();
	
	WebElement logoutLink = driver.findElement(By.className("rd_logout"));
	Assert.assertTrue(logoutLink.isDisplayed(), "I could not find the logout link");
		
	}
	@Test (priority =2 )
	public void verifyWithValidUserNameInvalidPassword() {
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda1@rediffmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("hgdgd");
		driver.findElement(By.className("signinbtn")).click();
		
		String actualWarningMessage = driver.findElement(By.xpath("//div[@id='div_login_error']")).getText();
		String expectedWarningMessage = ("Wrong username and password combination.");
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		
	}
	
	@Test (priority =3 )
	public void verifyWithiNValidUserNameValidPassword() {
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda1213@rediffmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("hgdgd");
		driver.findElement(By.className("signinbtn")).click();
		
		String actualWarningMessage = driver.findElement(By.cssSelector("div.div_login_error")).getText();
		String expectedWarningMessage = "Temporary Issue. Please try again later. [#5002].";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		
		
		
	}
	@Test (priority =4 )
	public void verifyWithInvalidCreditials() {
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda1213@rediffmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("hgdgd");
		driver.findElement(By.className("signinbtn")).click();
		
		String actualWarningMessage = driver.findElement(By.cssSelector("div#div_login_error")).getText();
		String expectedWarningMessage = "Wrong username and password combination.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
				
		
	
		
	}
	@Test (priority =5 )
	public void noCredintials() {
		driver.findElement(By.className("signinbtn")).click();
		
		Alert alert = driver.switchTo().alert();
		String actaulAlertMessage = alert.getText();
		String expectedAlertMessage = "Please enter a valid user name";
		Assert.assertEquals(actaulAlertMessage,expectedAlertMessage);
		alert.accept();
		
		
		
		
		
				
			
		
		
		
	}
	@AfterMethod
	public void tearDown() {
		//driver.quit();
		
	}
	
	

}
