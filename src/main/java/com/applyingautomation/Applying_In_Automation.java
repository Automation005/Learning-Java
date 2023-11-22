package com.applyingautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  Applying_In_Automation {
	
	public static WebDriver driver;

	public static void main (String[]args) {
		registraionTN ("https://tutorialsninja.com/demo", "selenium", "panda", "seleniumpanda12354647@gmail.com", "564789330", "Selenium@123", "Selenium@123");
		Setup("https://tutorialsninja.com/demo/","seleniumpanda123@gmail.com","Selenium@123");	
		rediffLogIn("https://rediff.com", "Selenium", "Selenium@123");
	}
	public static void Setup(String Url, String email, String password) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));	
		driver.get(Url);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn-primary")).click();
		driver.quit();
		
	}
	
	public static void rediffLogIn(String rediffUrl, String rediffusername, String rediffpassword) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		driver.get(rediffUrl);
		driver.findElement(By.cssSelector("a.signin")).click();
		driver.findElement(By.cssSelector("input#login1")).sendKeys(rediffusername);
		driver.findElement(By.cssSelector("input#password")).sendKeys(rediffpassword);
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		driver.quit();
		
	}
	

	
	public static void registraionTN (String Url, String firstname, String lastname, String Email, String Telephone, String Password, String Passwordconfirm) {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));	
		driver.get(Url);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//fieldset[@id = 'account']/descendant::input[@name = 'firstname']")).sendKeys(firstname);
		driver.findElement(By.xpath("//fieldset[@id = 'account']/descendant::input[@name = 'lastname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//fieldset[@id = 'account']/descendant::input[@name = 'email']")).sendKeys(Email);
		driver.findElement(By.xpath("//aside[@id = 'column-right']/preceding::input[@id = 'input-telephone']")).sendKeys(Telephone);
		driver.findElement(By.xpath("//input[@name = 'telephone']/following::input[@name = 'password']")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@name = 'telephone']/following::input[@name = 'confirm']")).sendKeys(Passwordconfirm);
		driver.findElement(By.xpath("//aside[@id = 'column-right']/preceding::input[@name = 'newsletter' and @value = '1']")).click();
		driver.findElement(By.xpath("//div[@class = 'pull-right']/child::a[1]/following-sibling::input[@name = 'agree']")).click();
		driver.findElement(By.xpath("//div[@class = 'pull-right']/descendant::input[@class = 'btn btn-primary']")).click();
		driver.quit();
		
		
		
	}
	
	
	
}
