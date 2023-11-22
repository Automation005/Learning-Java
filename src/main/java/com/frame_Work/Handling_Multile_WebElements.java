package com.frame_Work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Handling_Multile_WebElements {
	WebDriver driver;
	
	
	@Test
	public void webElement() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total of links presentes :" + links.size());
		
		WebElement link54 = links.get(53);
		System.out.println("the text of this link is :" + link54.getText());
		System.out.println("the url for this 54 link is :" + link54.getAttribute("href"));
		System.out.println(link54.getLocation().x + "----->" + link54.getLocation().y);
		link54.click();
		
		
		
		
		
		
		
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
