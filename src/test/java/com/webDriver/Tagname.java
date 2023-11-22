package com.webDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("total links are :" + allLinks.size());//will print how many links available in this webpage.
		
		

	}

}
