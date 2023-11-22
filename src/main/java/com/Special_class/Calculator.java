package com.Special_class;

import java.util.Scanner;

public class Calculator {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int number1 = scan.nextInt();
		
		
		System.out.println("Enter the second number");
		int number2 = scan.nextInt();
		
		System.out.println("select mathimatical opoeration (+, -, *, /)");
		String mathimaticalOperation = scan.next();
		
	int result;
	
	
	switch(mathimaticalOperation) {
	
	case"+": result = number1 + number2;
	System.out.println("the sum of two number is :" + result);
	break;
	
	case"-": result = number1 - number2;
	System.out.println("the diffrence of two number is :" + result);
	break;
	
	case"*": result = number1 * number2;
	System.out.println("the multiplication of two number is : " + result);
	break;
	
	case"/": result = number1 / number2;
	System.out.println("the division of two number is :" + result);
	break;
	
	default:System.out.println("Invalid mathamticalOperation");
	break;
		
	}
		
		
	}
	

}
