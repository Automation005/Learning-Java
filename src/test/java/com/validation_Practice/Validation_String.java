package com.validation_Practice;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_String {

	public static void main(String[] args) {
		
	
		validationAtWebpageLevel();
	
	
	
		
		
	}
		public static void validationAtWebpageLevel() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://rediff.com");
			System.out.println(driver.getTitle()); //Rediff.com: News | Rediffmail | Stock Quotes | Shopping
			System.out.println(driver.getCurrentUrl()); //
			
			String actualTitle = driver.getTitle();
			


	}

}
