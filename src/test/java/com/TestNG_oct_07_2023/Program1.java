package com.TestNG_oct_07_2023;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Program1 {
	public WebDriver driver;
	
	
@Test
public void setup( String browsername) {  // will not work on testNG
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(10)));
	driver.manage().timeouts().pageLoadTimeout((Duration.ofSeconds(20)));
	driver.manage().timeouts().scriptTimeout((Duration.ofSeconds(100)));
	driver.get("https://titurialsninga.com/demo");
	
	
}

}
