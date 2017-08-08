package com.org.MavenProject.MavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleMavenTest {
	WebDriver driver;
	@Test
	public void test(){
		System.out.println("Maven test successfull");
		driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("Google page opened");
		
	}

}
