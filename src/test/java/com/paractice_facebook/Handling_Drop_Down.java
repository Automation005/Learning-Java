package com.paractice_facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.applyingautomation.Util;

public class Handling_Drop_Down {
      public static WebDriver driver;
      
     
	public static void main(String[] args) throws InterruptedException {
		facebook("https://www.facebook.com/", "Ali", "David", "Martinez" );	

	}
	public static void facebook(String Url, String first_name, String last_name, String password) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Url);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name=firstname]")).sendKeys(first_name);
		driver.findElement(By.cssSelector("input[name=lastname]")).sendKeys(last_name);
		driver.findElement(By.cssSelector("input[name=reg_email__]")).sendKeys(Util.emailWithDateTimeStamp());
		driver.findElement(By.cssSelector("input[name=reg_email_confirmation__]")).sendKeys(Util.emailWithDateTimeStamp());
		driver.findElement(By.cssSelector("input[autocomplete=new-password]")).sendKeys(password);
		
		Select select  = new Select(driver.findElement(By.cssSelector("select[name=birthday_month]")));
		       select.selectByVisibleText("Mar");
		       
		Select select1 = new Select (driver.findElement(By.cssSelector("select#day")));
		select1.selectByVisibleText("3");
		
		Select select2 = new Select(driver.findElement(By.cssSelector("select[aria-label=Year]")));
		select2.selectByVisibleText("2000");
		
		driver.findElement(By.xpath("//span[@class='_5k_3']/descendant::label[text()='Male']")).click();
       
		
		driver.findElement(By.cssSelector("#u_0_s_ep")).click();
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
