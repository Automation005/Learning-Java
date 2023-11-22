package com.ExceptionHandling_Day17;

public class Exception_Handling {

	public static void main(String[] args) {
		//Inexpected event happening during an execution this exception disrupt the flow
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		try {
			System.out.println(5/0);
		} catch (Exception e) {
			
			e.printStackTrace();
		}  // risky code
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");


	}

}
