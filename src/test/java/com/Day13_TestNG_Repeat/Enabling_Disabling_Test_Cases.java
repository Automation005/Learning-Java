package com.Day13_TestNG_Repeat;

import org.testng.annotations.Test;

public class Enabling_Disabling_Test_Cases {
	
@Test (priority = 1, enabled = true )
public void logic1() {
	System.out.println("logic 1");
	
}
@Test(priority = 2, enabled =false)// to disable test case use (enable =false)
public void logic2() {
	System.out.println("logic2");	
}
@Test(priority = 3, invocationCount = 5)// this test will be executed 5 times 
public void logic3() {	
	System.out.println("logic2");	
	}
	
}
	


