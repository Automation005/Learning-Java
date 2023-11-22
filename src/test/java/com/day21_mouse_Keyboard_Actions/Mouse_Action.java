package com.day21_mouse_Keyboard_Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_Action<WebElemenet> {
	public ChromeOptions options;
	public WebDriver driver;
	public Actions actions;
	
	
	@Test
	public void draggable() {
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		driver= new ChromeDriver(options);
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> totalFrame = driver.findElements(By.tagName("iframe"));
		System.out.println("total of i frame element:" + totalFrame.size());
		
		driver.switchTo().frame(0);
		Actions action = new Actions (driver);
		 
		WebElement source = driver.findElement(By.id("draggable"));
		action.dragAndDropBy(source, 300, 0).build().perform();
		
		
		
		
	}
	

}
