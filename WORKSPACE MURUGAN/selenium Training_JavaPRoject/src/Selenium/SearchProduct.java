package com.wipro.junitdemos;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class SearchProduct {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void initializeBrowser() {
		//01.Set System property - browser specific driver file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sa541652\\Desktop\\Selenium_77768\\Driver\\chromedriver.exe");
	
	//02. Create webdriver instance
	driver=new ChromeDriver();
	
	//03. Open browser
	driver.get("http://spezicoe.wipro.com:81/opencart1/");
	
	//04. Maximixe browser
	driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void searchProduct() {
		
		driver.findElement(By.name("search")).sendKeys("Apple");
	
		//verify title
		
		String expected, actual;
		
		expected="Your Store";
		actual=driver.getTitle();
		
		Assert.assertEquals(expected, actual);
		

	}
	
	@AfterClass
	public static void closeBrowser() {
		
		//05. Close browser
				driver.close();
		
	}

}
