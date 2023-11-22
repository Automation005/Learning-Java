package com.TestNG_oct_07_2023;

public class NamingConvertionMethod {

	public static void main(String[] args) {
		fiveParameters(true, false, 3, 7, "hello");
		//parameters("hello","world", "auto");
	}
	
	
	public static String parateters(String S1,String S2, String S3) {
	String S4 = S1 + S2 + S3;
	System.out.println(S4);
	return S4;
	
	
		
	}
	
	public static void exampleWithTwoParameters(boolean b1, boolean b2) {
	
		
	}
	public static int fourParamaters(int i, int j, int l, int n) {
	int k = i+j+l+n;
	System.out.println(k);
	return k;
	
}
	public static String fiveParameters(boolean b1, boolean b2, int k, int t, String S7) {
	System.out.print(b1);	
	System.out.print(b2);	
	System.out.print(k);	
	System.out.print(t);	
	System.out.print(S7);	
	return S7;
		
}
	
	
	
	public static String sixParameters(String S1,String S2, String S3, String S4, String S5, String S6) {
	
		String S8 = S1+S2+S3+S4+S5+S6;
		System.out.println(S8);
	return S8;
	
		
}
		
		
	}
