package com.day21_mouse_Keyboard_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.applyingautomation.Util;

public class Keyboard_Action {
	public WebDriver driver;
	
	@Test
	public void registrationTN() {
		
		/*driver = new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My account")).click();
		driver.findElement(By.linkText("Register")).click();
		
		
		Actions action = new Actions(driver);
		WebElement username = driver.findElement(By.id("login1"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement signInButton = driver.findElement(By.className("signinbtn"));

		action.click(username).sendKeys("seleniumpanda@rediffmail.com").perform();
		//Selecting all - Ctrl+A
		action.keyDown(username, Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		//Copy - Ctrl+C
		action.keyDown(username, Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		//Paste - Ctrl+V
		action.click(password).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		action.click(signInButton).perform();*/

		}

	@Test
	public void Tutorialninja() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		
		Actions action = new Actions(driver);
		

		WebElement firstname = driver.findElement(By.id("input-firstname"));
		WebElement lastname = driver.findElement(By.id("input-lastname"));
		WebElement email = driver.findElement(By.id("input-email"));
		WebElement telephone = driver.findElement(By.id("input-telephone"));
		WebElement password = driver.findElement(By.id("input-password"));
		WebElement confirmPassword = driver.findElement(By.id("input-confirm"));
		WebElement subscribe = driver.findElement(By.xpath("//input[@value='1']"));
		WebElement privacyPolicy = driver.findElement(By.cssSelector("a.agree"));
		WebElement continueButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		
		action.click(firstname).sendKeys("java").perform();
		action.sendKeys(Keys.TAB);
		action.click(lastname).sendKeys("selenium").perform();
		action.sendKeys(Keys.TAB);
		action.click(email).sendKeys(Util.emailWithDateTimeStamp()).perform();
		action.sendKeys(Keys.TAB);
		action.click(telephone).sendKeys("786585869").perform();
		action.sendKeys(Keys.TAB);
		action.click(password).sendKeys("poiii").perform();
		action.sendKeys(Keys.TAB);
		action.click(confirmPassword).sendKeys("poiii").perform();
		action.sendKeys(Keys.TAB);
		action.click(subscribe).click().perform();
		action.sendKeys(Keys.TAB);
		action.click(privacyPolicy).perform();
		action.sendKeys(Keys.TAB);
		action.click(continueButton).click().perform();
		
		
		
		
		
	}

}