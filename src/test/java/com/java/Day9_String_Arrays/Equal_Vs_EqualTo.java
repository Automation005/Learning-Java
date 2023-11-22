package com.java.Day9_String_Arrays;

public class Equal_Vs_EqualTo {

	public static void main(String[] args) {
    String S1 =new String("Java");// 2 objects are created 
    String S2 =new String("Java");// only 1 object will be created because on SLP java already created on S1 
    
    System.out.println(S1==S2);//False 
    
    String S3 = ("Java");
    String S4 = ("Java");
    
    System.out.println(S3==S4);//True
    
    


	}

}
