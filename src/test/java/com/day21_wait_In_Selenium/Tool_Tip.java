package com.day21_wait_In_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tool_Tip {
	
	public WebDriver driver;
	
	@Test
	public void tool_Tip() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
	}

}
