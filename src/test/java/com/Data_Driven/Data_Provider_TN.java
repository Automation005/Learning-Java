package com.Data_Driven;

import org.testng.annotations.DataProvider;

public class Data_Provider_TN {
	
	@DataProvider
	public Object[][] login() {
		Object [][] login = {{"seleniumpanda@gmail.com" , "Selenium@123"},
				             {"seleniumpanda1@gmail.com" , "Selenium@123"},
				             {"seleniumpanda2@gmail.com" , "Selenium@123"},
				             {"seleniumpanda3@gmail.com" , "Selenium@123"},
				             {"seleniumpanda4@gmail.com" , "Selenium@123"},
				             {"seleniumpanda5@gmail.com" , "Selenium@123"},
				             {"seleniumpanda6@gmail.com" , "Selenium@123"}};
		
		return login; 
				
	
	
	}

}
