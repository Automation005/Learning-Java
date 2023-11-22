package com.Day13_TestNG_Repeat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InSite_Web {


	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pg.4cd.edu/_layouts/PG/login.aspx?ReturnUrl=%2Fsso%2Fgo.ashx%3FSAMLRequest%3DfZHLbsIwEEV%252FxZo9eUIeFgmKQKhIUKECXXRTuY4JkRI79TgRn1%252BXQksX7XI09%252FqMjqezc9uQQWislczAdzwgQnJV1rLK4LBfjhKY5VNkbRN0tOjNST6J916gIbYokX5tMui1pIphjVSyViA1nO6KzZoGjkc7rYziqgFSIAptLGquJPat0Duhh5qLw9M6g5MxHVLXbZ0xLx1R9i5vmSW6nwwXUQFZWHAtmbkce8t31XfBhtxKOQxPZyBLpbm4nJzBkTUogKwWGcw3xWH%252F8JqkIo2iNCnDNCqTcRwl5RsfH4MwngQ88GIbxi1DrAfxU0fsxUqiYdJkEHhBOPK9kT%252FZexH1JzSIHS8KX4BstRrqUuhHq8ICWdv1uAHyfNNspcBVKr28qe9t%252Fi%252BT3RRC%252FqewRlW1nLr3gPw6%252Fv7E%252FAM%253D%26RelayState%3DCMAUTH_89e96698d396d84768dbc4f23752c207%26SigAlg%3Dhttp%253A%252F%252Fwww.w3.org%252F2001%252F04%252Fxmldsig-more%2523rsa-sha256%26Signature%3DNK0SsAkh4CfEBV2B2UxG7xffN2CYGWfmWN%252BCyRt1g4u8ZGhMmv0hKVkAiIwhTtuZ2OBy2J2%252FGkrjNjMMrry0zNeeUB1BVcMtHT3BONYP1PZWdva3jGQ0bha3jQU%252BIbCcaeCh1JhUDz0%252FCHgQXmugP2uY7MlSx6r2QL9vtP%252Bi75XLVg1nf4bv6vYGE7o7isL8Ts1NfkzLrdWGjWe705jWfMttD4PUF7ILqPeZOdlhmC%252BwToNewe5HOkcpE5tuujdC8lsQY%252BQtCg5vcrDY6wz4lJ8JTDyM4ccMY%252BmC3WVFuMy3%252Bu7ZgtSauc8rz2dh3P6njYe0VhDCW7BpaATyQhgtyg%253D%253D");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#frmLogin_UserName")).sendKeys("Oziani086");
		driver.findElement(By.cssSelector("input#frmLogin_Password")).sendKeys("Linaben2016");
		driver.findElement(By.cssSelector("button#btnLogin")).click();
		
		
	
		
		
	
	}
		
		
	}


