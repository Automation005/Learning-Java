package com.Day18_Wrapper_Prising;

public class Class_Work {

	public static void main(String[] args) {
		//StringTolong();
		StringToDouble();
		//StringToboolean();

	}
		public static void StringTolong() {
			String S1 = "123349696070770";
			String S2 = "09987654543221343";
			long l1 = Long.parseLong(S1);
			long l2 = Long.parseLong(S2);
			System.out.println(l1+l2);
			
		}	
		
		public static void StringToDouble() {
			String S1 = "10.99";
			String S2 = "20.88";
			double d1 = Double.parseDouble(S1);
			double d2 = Double.parseDouble(S2);
			 System.out.print("this is the substraction d2-d1 = " );
			 System.out.println(d2-d1);
		}
		 public static void StringToboolean() {
			 String Result1 = "true";
			 String Result2 = "false";
			 boolean b1 = Boolean.parseBoolean(Result1);
			 boolean b2 = Boolean.parseBoolean(Result2);
			 
			 System.out.println(b1 == b2);
			 
			 

		 }
		


}
