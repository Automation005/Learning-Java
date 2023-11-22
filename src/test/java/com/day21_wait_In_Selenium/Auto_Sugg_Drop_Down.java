package com.day21_wait_In_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Auto_Sugg_Drop_Down {
	public WebDriver driver;
	
	@Test
	public void sugg_Drop_down() throws Exception {
		driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
		Thread.sleep(2000);
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder=From]")).sendKeys("new");
		Thread.sleep(1000);
		 int i=0;
		 while (i<5) {
			 
		 }
	}
		 @Test
		public void googleDropDown() throws Exception {
			    driver = new ChromeDriver ();
				driver.manage().window().maximize();
				driver.get("https://www.google.com/");
				
				driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("selenium");
				Thread.sleep(2000);
				int i=0;
				while (i<5) {
					Thread.sleep(2000);
					driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys(Keys.DOWN);
					i++;
					//driver.findElement(By.xpath("//div[@class='wM6W7d WggQGd']//descendant::b[text()=' documentation']")).click();
					driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys(Keys.ENTER);
				}
				

				}	
				
				@Test
				public void makeMyTripDropDown() throws Exception {
					driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					//driver.manage().deleteAllCookies();
				    driver.get("https://www.makemytrip.com/");
				    Thread.sleep(2000);
				    driver.findElement(By.id("toCity")).click();
				    Thread.sleep(2000);
				    
				    driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("las");
				    int j=0;
				    while(j<5) {
				    	Thread.sleep(2000);
				    	driver.findElement(By.cssSelector("input[placeholder=To")).sendKeys(Keys.DOWN);
				    	j++;
				    	driver.findElement(By.cssSelector("input[placeholder=To")).sendKeys(Keys.ENTER);
				    	
				    	
				    }
					
					
				}
				
					
				
				
			 
			 
		 
		
		
		
		
	
@AfterMethod
public void tearDown() {
	//driver.quit();
	
}
}
