package com.practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applyingautomation.Util;



public class Ebay_Practice {
	
	public static void main(String[]args) throws InterruptedException {
		
		registration();
		
		
	}
		
		public static void registration() throws InterruptedException {
			
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.target.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.linkText("Create Account")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#username")).sendKeys(Util.emailWithDateTimeStamp());
		driver.findElement(By.cssSelector("input#firstname")).sendKeys("luna");
		driver.findElement(By.cssSelector("input#lastname")).sendKeys("lina");
		driver.findElement(By.cssSelector("input#phone")).sendKeys("5104840716");
		driver.findElement(By.cssSelector("input.h-text-left")).sendKeys("Linayacine20");
		driver.findElement(By.xpath("//div[@class='styles__StyledRightContentWrapper-sc-l95d1s-0 ciMnCx']/child::button[@class='styles__StyledLink-sc-vpsldm-0 eqjfDm']")).click();
		driver.findElement(By.cssSelector("input#keepMeSignedIn")).click();
		driver.findElement(By.cssSelector("button#createAccount")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your code']")).sendKeys("342546");
		driver.findElement(By.cssSelector("#verify")).click();
		
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}


