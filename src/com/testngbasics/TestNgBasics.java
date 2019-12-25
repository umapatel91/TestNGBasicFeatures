package com.testngbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgBasics {

	WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "J:\\Uma_Testing\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	@Test(priority=1,groups="Title")
	public void googleTitleTest(){
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=2,groups="Check URL")
	public void googlePageURL(){
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	@AfterMethod
	public void teardown(){
		driver.close();
	}
	
	
}
