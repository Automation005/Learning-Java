package com.Properties_File;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class How_To_Read_From_Properties_Files {
	public WebDriver driver;
	

	
	
	@Test
	
	public void read_From_Properties_FIle() throws Exception {
		Properties prop = new Properties();
		FileInputStream  ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\DataDriven_DataProvider\\config.properties");
	
		prop.load(ip);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		
	
	}
	  
	  
	
}
