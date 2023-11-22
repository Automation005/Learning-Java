package com.java.Day9_String_Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.applyingautomation.Util;



public class Class_Assignement {
	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		Assert.assertTrue(driver.findElement(By.linkText("Register")).isDisplayed());
		driver.findElement(By.linkText("Register")).click();
		
	}
		@Test(priority=1)
		public void verifyRegisterWithMandatoryFields() {
			
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("panda");
		driver.findElement(By.id("input-email")).sendKeys(Util.emailWithDateTimeStamp());
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input[name=agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		String actualAccountSuccessMessage = driver.findElement(By.xpath("//div[@id='content']/child::p[1]")).getText();
		String expectedAccountSuccessMessage = "Congratulations! Your new account has been successfully created!";
		Assert.assertTrue(actualAccountSuccessMessage.contains(expectedAccountSuccessMessage));
		
		
		}
		@Test(priority=2)	
		public void verifyRegisterWithAllFields() {
			driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
			driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("panda");
			driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda3500@gmail.com");
			driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
			driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
			driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
			driver.findElement(By.cssSelector("input[value='1'][name='newsletter']")).click();
			driver.findElement(By.cssSelector("input[name=agree]")).click();
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			
			String actualAccountSuccessMessage = driver.findElement(By.xpath("//div[@id='content']/child::p[1]")).getText();
			String expectedAccountSeuccessMessage = "Congratulations! Your new account has been successfully created!";
		    Assert.assertTrue(actualAccountSuccessMessage.contains(expectedAccountSeuccessMessage));
			
			
		}
		@Test(priority=3)
		public void verifyRegistrationWithExistingEmail() {
			driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Selenium");
			driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("panda");
			driver.findElement(By.cssSelector("input#input-email")).sendKeys("seleniumpanda123@gmail.com");
			driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("9876543210");
			driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium@123");
			driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Selenium@123");
			driver.findElement(By.cssSelector("input[value='1'][name='newsletter']")).click();
			driver.findElement(By.cssSelector("input[name=agree]")).click();
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			String actualDuplicateEmailWarning = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
			String expectedDuplicateEmailWarning = "Warning: E-Mail Address is already registered!";
			Assert.assertTrue(actualDuplicateEmailWarning.contains(expectedDuplicateEmailWarning), "Then my assertion is incorrect");		
			
			}
		
		@Test(priority=4)
		public void verifyRegistrationWithnoDetails() {
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			
			String actualPrivacyPolicyWarning = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
			String expectedPrivacyPolicyWarning = "Warning: You must agree to the Privacy Policy!";
			Assert.assertTrue(actualPrivacyPolicyWarning.contains(expectedPrivacyPolicyWarning));
			
			String actualFirstNameErrorMessage =  driver.findElement(By.xpath("//div[contains(text(),'First Name must be between 1 and 32 characters!')]")).getText();
			String expectedFirstNameErrorMessage = "First Name must be between 1 and 32 characters!";
			Assert.assertTrue(actualFirstNameErrorMessage.contains(expectedFirstNameErrorMessage));
			
			String actualLastNameErrorMessage = driver.findElement(By.xpath("//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")).getText();
			String ExpectedLastNameErrorMessage = "Last Name must be between 1 and 32 characters!";
			Assert.assertTrue(actualLastNameErrorMessage.contains(ExpectedLastNameErrorMessage));
			
			String actualEmailWarning = driver.findElement(By.xpath("//div[contains(text(),'E-Mail Address does not appear to be valid!')]")).getText();
			String expectedEmailWarning = "E-Mail Address does not appear to be valid!";
			Assert.assertTrue(actualEmailWarning.contains(expectedEmailWarning));
			
			String actualTelephoneWarningMessage = driver.findElement(By.xpath("//div[contains(text(),'Telephone must be between 3 and 32 characters!')]")).getText();
			String extectedTelephoneWarningMessage = "Telephone must be between 3 and 32 characters!";
			Assert.assertTrue(actualTelephoneWarningMessage.contains(extectedTelephoneWarningMessage));
			
			String actualPasswordWarning = driver.findElement(By.xpath("//div[contains(text(),'Password must be between 4 and 20 characters!')]")).getText();
			String expectedPasswordWarning = "Password must be between 4 and 20 characters!";
			Assert.assertTrue(actualPasswordWarning.contains(expectedPasswordWarning));
			
			
			
			
			
			
			
			
			
		}
		
		//@AfterMethod
		public void teardown() {
			driver.quit();
			
		}
	
		}


