package com.TestNg10_01_23;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_From_Properties_File {
	
	public static  Properties prop;
	public static FileInputStream ip;
	public static void main(String[] args) throws Exception {
		
		Properties prop = new Properties();
		System.out.println(System.getProperty("user.dir"));
		
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\TestNg10_01_23\\config.properties");
		prop.load(ip);
		
		login();

	}
	
	
	public static void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://tutorialsninja.com/demo");
		driver.get(prop.getProperty("url"));             // we can get the url from the property by doing that 
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(prop.getProperty("validEmail"));
		driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("validPassword"));
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		
	}

}
