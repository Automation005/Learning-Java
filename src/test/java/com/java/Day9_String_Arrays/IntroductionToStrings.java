package com.java.Day9_String_Arrays;

public class IntroductionToStrings {
	
 public static void main(String[]args) {
	 //Memory();
	 string();
 }
 
	 public static void string() {
		 char[] a = {'a','z','u','l'};
		 String S1 = new String(a);
		 System.out.println(S1);
	 }
		 
	 public static void  Memory() {
		 String S1 = new String("Orange");
		 S1.concat("Apple"); 
		 System.out.println(S1); //the output will be orange because string object are final 
		 
		 S1 = S1.concat("Apple"); 
		 System.out.println(S1);// orangeapple 
		 
		 final int i=10;
		// i = 20 ; //  i=20 cannot be assigned because i value defined as final value =10
		 
		 
		 
		 
	 
	
	 
	 
	 
	 
	 
	 
 }
 
 
 
 
 
 
}
