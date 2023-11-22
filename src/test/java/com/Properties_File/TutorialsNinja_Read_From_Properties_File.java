package com.Properties_File;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TutorialsNinja_Read_From_Properties_File {
public WebDriver driver;

	
	
	@Test
	public void rediff_Propertries_Files() throws Exception{
	
			Properties prop = new Properties();
			FileInputStream  ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\DataDriven_DataProvider\\config.properties");
		
			prop.load(ip);
			
			String browserName ="Chrome";
			if (browserName.equals(prop.getProperty("browser"))){
			driver  =new ChromeDriver();
	}else if (browserName.equals("Firefox")){
				driver = new FirefoxDriver();
			}
			
		
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validUsername"));
			driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			
	
			
		
		
			
			
			
			
		
		
	}
		
	}
	

