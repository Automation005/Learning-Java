package com.complete.project;

import org.testng.Assert;

public class Application_Of_String {

	public static void main(String[] args) {
		//String_Program_2();
		//Application_String();
		AccessToCharOfstring();
		
		
	}
	public static void Application_String () {
		
		String S1 = new String("hello");
		S1.concat("world");
		S1=S1.concat(S1);  // concat is an inbuilt method
		
		System.out.println(S1);

	}	
	public static void String_Program_2() {
		
		System.out.println("my.....has an....tomorrow at...in...");		 
		String name = "son";
		String object = "apppointment";
		String time = "10 o'clock";
		String place = "walnut creek";
		
		System.out.println("my"+ " " + name + " " + "has an " +object+" " +"tomorrow at"+" "+ time +" "+ "in"+ " " + place  );
		
	}
	
	public static void AccessToCharOfstring () {
		
		String S = "abcb%bc ";
		System.out.println(S.charAt(4));// find the 5th caracter becasue it's start from 0
		System.out.println(S.length()); // print the length of string
		
		 S = S.concat("0");
		char y[] = S.toCharArray();// covert String to Array
	
       System.out.println(y);
       }

		
	
		
	}
		
	
	
		
		
		
		
		
	 
	 
	 
	 

	


