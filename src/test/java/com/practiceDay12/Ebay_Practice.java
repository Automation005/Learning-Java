package com.practiceDay12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.applyingautomation.Util;

public class Ebay_Practice {
	
	public WebDriver driver;
	
	@Test
	
	public  void targetRegistration(String firstname, String lastname, String phone) throws InterruptedException {
		firstname = "Luna";
		lastname = "lina";
		phone = "8765432627";
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.target.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.linkText("Create Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#username")).sendKeys(Util.emailWithDateTimeStamp());
		driver.findElement(By.cssSelector("input#firstname")).sendKeys(firstname);
		driver.findElement(By.cssSelector("input#lastname")).sendKeys(lastname);
		driver.findElement(By.cssSelector("input#phone")).sendKeys(phone);
		driver.findElement(By.cssSelector("input.h-text-left")).sendKeys("Linayacine20");
		driver.findElement(By.xpath("//div[@class='styles__StyledRightContentWrapper-sc-l95d1s-0 ciMnCx']/child::button[@class='styles__StyledLink-sc-vpsldm-0 eqjfDm']")).click();
		driver.findElement(By.cssSelector("input#keepMeSignedIn")).click();
		driver.findElement(By.cssSelector("button#createAccount")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your code']")).sendKeys("342546");
		driver.findElement(By.cssSelector("#verify")).click();
		
	}
}
