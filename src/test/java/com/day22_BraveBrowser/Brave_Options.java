package com.day22_BraveBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Brave_Options {
	public WebDriver driver;
	
	@Test
	public void launching_App() {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");//will open in brave browser
		options.addArguments("--start maximized");
		driver=new ChromeDriver();
		
		
		
	}
	
	
	

}
