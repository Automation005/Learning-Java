package com.frame_Work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FlipKart {
	public WebDriver driver;
	
	@Test
	public void flipKart() {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=shirt&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		List<WebElement> formalShirt = driver.findElements(By.cssSelector("div._2WkVRV"));
		List<WebElement> descrition = driver.findElements(By.cssSelector("a.IRpwTa"));
		List<WebElement> price = driver.findElements(By.cssSelector("div._30jeq3"));
		List<WebElement> discountPercentage = driver.findElements(By.cssSelector("div._3Ay6Sb"));
		for (int i=0; i<formalShirt.size(); i++) {
			System.out.println(formalShirt.get(i).getText()+"***"+ descrition.get(i).getText()+"***"+price.get(i).getText()+"***"+discountPercentage.get(i).getText());
			
		}
			}
	

	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
