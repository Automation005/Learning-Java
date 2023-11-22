package com.TestNG_oct_07_2023;

public class Pilliars_Of_Java {

	public static void main(String[] args) {
		//adding();
		validatesalary();
		//joingthreestrings();
	}
	
	public static int adding() {
		int i = 10;
		int j = 20;
		int k =i+j;
		System.out.println(k);
		return k;
		
	}
	
	public static String joingthreestrings() {
		String S1 = "Hello";
		String S2 = "World";
		String S3 = "Automation";
		String S4 = S1 + " " + S2 +" "+ S3;
		System.out.println(S4);
		return S4;		
		
	}
	public static void validatesalary() {
		boolean salaryincrease2022 = true;
		boolean salaryincrease2023 = false;
		int performance = 95;
		int expectation = 100;
		
		if (performance>expectation) {
			System.out.println("No salary increase");
		}else {
			System.out.println("salary increase");		
		}
		
		
	}
	
}
