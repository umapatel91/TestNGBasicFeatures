package com.testngbasics;

import org.testng.annotations.Test;

public class TestNgFeatures {
	
	@Test
	public void LoginTest() {
		System.out.println("Login test");
		//int i =9/0;
	}
	@Test(dependsOnMethods = "LoginTest")
	public void HomePageTest() {
		System.out.println("Home Page Test");
	}
	@Test(dependsOnMethods = "LoginTest")
	public void SearchPageTest() {
		System.out.println("Search Page Test");
	}
	@Test(dependsOnMethods = "LoginTest")
	public void RegisterPageTest() {
		System.out.println("Register Page Test");
	}

}
