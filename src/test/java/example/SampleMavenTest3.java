package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleMavenTest3 {
	WebDriver driver;
	@Test
	public void test3(){
		System.out.println("Maven test 3 successfull");
		driver=new FirefoxDriver();
		driver.get("http://www.guru99.com/");
		System.out.println("Guru99 page opened");
		
	}

}
