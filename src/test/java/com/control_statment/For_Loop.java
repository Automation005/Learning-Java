package com.control_statment;

import java.io.FileInputStream;
import java.util.Properties;

public class For_Loop {
	
	public static Properties prop;
	public static FileInputStream ip;
	
	public static void main (String[]args) {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("dir.user")+"\\src\\test\\java\\com\\Properties_File\\practice.properties");
		prop.load(ip);
		
				
		
		
		
	}

}
