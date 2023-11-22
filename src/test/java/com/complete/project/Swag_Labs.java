package com.complete.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Swag_Labs {
	public WebDriver driver;
	public ChromeOptions options;
	public Properties prop;
	public FileInputStream ip;
	
	

	@BeforeMethod
	public void setup() throws Exception {
		driver = new ChromeDriver(); // create object of my ChromeDriver // abstract method of WebDriver
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); // use refrence driver to call those abstract methods
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\complete\\project\\Swag.properties");
		prop.load(ip);	
		driver.get(prop.getProperty("Url"));	
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());		
	}
	

	@Test(priority = 1)
	public void veriyLoginWithValidUserNameValidPassword() {

		driver.findElement(By.cssSelector("input#user-name")).sendKeys(prop.getProperty("userName"));
	    driver.findElement(By.cssSelector("input#password")).sendKeys(prop.getProperty("Password"));
	    driver.findElement(By.cssSelector("input#login-button")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("div.app_logo")).isDisplayed());
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		String actualtextbox = driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-backpack")).getText();
		String expectedtextbox = "Add to cart";
		Assert.assertTrue(actualtextbox.equals(expectedtextbox));
		if (actualtextbox.equals(expectedtextbox)) {
			System.out.println("page element exists");

		} else

		System.out.println("page element does't't exists");

	}

	@Test(priority = 2)
	public void veriyLoginWithValidUserNameInvalidPassword() {
		driver.findElement(By.cssSelector("input#user-name")).sendKeys(prop.getProperty("userName"));
		driver.findElement(By.cssSelector("input#password")).sendKeys(prop.getProperty("InavalidPassword"));
		driver.findElement(By.cssSelector("input#login-button")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		String expectedWarningMessage =prop.getProperty("InvalideCredenialwarningMessage");
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));

	}

	@Test(priority = 3)
	public void veriyLoginWithInvalidUserNameValidPassword() {
		driver.findElement(By.cssSelector("input#user-name")).sendKeys(prop.getProperty("userName"));
		driver.findElement(By.cssSelector("input#password")).sendKeys(prop.getProperty("InavalidPassword"));
		driver.findElement(By.cssSelector("input#login-button")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		String expectedWarningMessage = prop.getProperty("InvalideCredenialwarningMessage");
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));

	}

	@Test(priority = 4)
	public void verifyLoginWithNoCredintial() {
		driver.findElement(By.cssSelector("input#login-button")).click();
		String actualWarningMessage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		String expectedWarningMessage = prop.getProperty("NoCredenialsWarningMessage");
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
