package aster22A;
import org.openqa.selenium.firefox.FirefoxDriver;

import graphql.Assert;

//import dev.failsafe.internal.util.Assert;

public class MyTesting {
	public static void verifyTitleOfHomePage() {
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("amazon"));
		
	}
	
	public static void main(String args[]) {
		verifyTitleOfHomePage();
	}
	
}