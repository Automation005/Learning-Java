package com.aletrt_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handle_Alert {

	

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("https://www.userbrain.com");
		
		

	}

}
