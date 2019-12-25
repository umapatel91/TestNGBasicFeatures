package com.testngbasics;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {

//	@Test(invocationTimeOut = 2)
//	public void infiniteLoopTest() {
//		int i=1;
//		while(i==1) {
//			System.out.println(i);
//		}
//	}
	@Test(expectedExceptions = NumberFormatException.class)
	public void test1() {
		String s ="1100A";
		Integer.parseInt(s);
	}
	
}
