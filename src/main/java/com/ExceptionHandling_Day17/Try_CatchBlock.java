package com.ExceptionHandling_Day17;

public class Try_CatchBlock {

	public static void main(String[] args) {
		System.out.println("a");
		System.out.println("hello");
		System.out.println("Pnt");
		try {
			System.out.println(5/0);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		System.out.println("23");
		System.out.println(12/3);
		
		

	}

}
