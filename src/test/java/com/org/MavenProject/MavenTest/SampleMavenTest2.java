package com.org.MavenProject.MavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleMavenTest2 {
	WebDriver driver;
	@Test
	public void test2(){
		System.out.println("Maven test 2 successfull");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("Facebook login page opened");
		
	}

}
