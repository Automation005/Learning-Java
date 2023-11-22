package com.frame_Work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Clicking_Simutanousely_Multiple_links {
	public WebDriver driver;
	
	@Test 
	public void rediff() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		List<WebElement> redifffooterLinks = driver.findElements(By.xpath("//div[@class='footer alignC']/a"));
		for (int i=0 ; i<redifffooterLinks.size(); i++) {
			String url = redifffooterLinks.get(i).getAttribute("href"); // get url for each link
			System.out.println(redifffooterLinks.get(i).getText() + "---->"+ url);
			redifffooterLinks.get(i).click(); // click on each link
			
			
		}
		
		
				
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
