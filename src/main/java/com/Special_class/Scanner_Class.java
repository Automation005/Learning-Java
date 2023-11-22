package com.Special_class;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	 System.out.println("enter name");
	 String name = scan.next();
	 
	 System.out.println("enter gender");
	 char gender = scan.next().charAt(0);
	 
	 System.out.println("enter age");
	 int age = scan.nextInt();
	 
	 System.out.println("enter phone");
	 long phonenumber = scan.nextInt();
	 
	  System.out.println("the name of the person is:" + name);
	  System.out.println("the name of the person is:" + age);
	  System.out.println("the name of the person is:" + gender);
	  System.out.println("the name of the person is:" + phonenumber);
	  
	 

	}

}
