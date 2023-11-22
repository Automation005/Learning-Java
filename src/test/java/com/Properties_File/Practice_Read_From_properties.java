package com.Properties_File;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Read_From_properties {
	
	public static Properties prop;
	public static FileInputStream ip;


	public static void main(String []args) throws Exception {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\com\\Properties_File\\practice.properties");
		prop.load(ip);
		
		piitLogin();
		}
		
		public static void piitLogin() {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
	driver.findElement(By.xpath("//div[@class='roundframe']//input[@name='user']")).sendKeys(prop.getProperty("username"));
	driver.findElement(By.cssSelector("input.input_password")).sendKeys(prop.getProperty("password"));
	driver.findElement(By.cssSelector("input[name=cookielength]")).sendKeys(" ");
	driver.findElement(By.cssSelector("input.input_check")).click();
	//driver.findElement(By.xpath("//p[@class='centertext']//input[@class='button_submit']")).click();
	
	
	
	
	
	
	
	
	
	}
	
}
		
		
		
	

