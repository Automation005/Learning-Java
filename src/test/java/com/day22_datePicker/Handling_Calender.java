package com.day22_datePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test; 

public class Handling_Calender {
	public WebDriver driver;
	public WebDriverWait wait;
	
	
 
	@Test 
	public void datePicker1 () throws Exception {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.cssSelector("input#datepicker")).click();
		
		
	   wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		
		System.out.println(monthYear);
		
		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];
		
		while(!(month.equals("December") && year.equals("2025"))) {
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			month = monthYear.split(" ")[0];
		    year = monthYear.split(" ")[1];
		    Thread.sleep(1000);
	 
		    driver.findElement(By.xpath("//td[@data-handler ='selectDay']/a[text()='25']")).click();
		    
		    
		    
			
			
					
					
		}
		
		
		
	}
}
