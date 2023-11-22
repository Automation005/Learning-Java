package com.webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web_Driver_Practice {

	public static void main(String[] args) throws Exception {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("mohammed");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Benchabane");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9805634876");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("mohbenchbaane@yahoo.com");
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		select.selectByVisibleText("Feb");
		
		Select select1 = new Select(driver.findElement(By.id("day")));
		select1.selectByVisibleText("19");
		
		Select select2 = new Select(driver.findElement(By.id("year")));
		select2.selectByVisibleText("1980");
		
		driver.findElement(By.xpath("//label[@for='u_2_4_NJ']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
