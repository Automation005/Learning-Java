package com.TestNg10_01_23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Assignement {
	
	public static WebDriver driver;
	public static void main(String[]args) {
		
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));	
		driver.get("https://rediff.com");
		driver.findElement(By.cssSelector("a.signin")).click();
		driver.findElement(By.cssSelector("input#login1")).sendKeys("moh");
		driver.findElement(By.cssSelector("input#password")).sendKeys("ali");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		//driver.quit();	
		
		
	}


}
