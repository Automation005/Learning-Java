package com.Special_class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Class {
	public static SimpleDateFormat  sdf;// defint here no need to repeat it each time and write just sdf

	public static void main(String[] args) {
		Date date = new Date (); // Create Object for date class
		System.out.println(date);
		System.out.println(date.toString());
		
		String emailTimeStamp = date.toString().replace(" "," ").replace(":", ":");
		System.out.println(emailTimeStamp);
		
		//change date format
		
		sdf = new SimpleDateFormat("m/dd/yyyy"); // == sdf =  = new SimpleDateForma
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("m/dd/yyyy hh:mm:ss"); 
		System.out.println(sdf.format(date));
		
		
		
		
		

	}

}
