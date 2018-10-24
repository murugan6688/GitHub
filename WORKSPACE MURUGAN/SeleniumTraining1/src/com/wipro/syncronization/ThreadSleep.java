package com.wipro.syncronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadSleep {

	public static void main(String[] args) throws InterruptedException {
	
		//01.Set System property - browser specific driver file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sa541652\\Desktop\\Selenium_77768\\Driver\\chromedriver.exe");
	
	//02. Create webdriver instance
	WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//03. Open browser
	driver.get("http://spezicoe.wipro.com:81/opencart1/");
	
	//maximize browser
	driver.manage().window().maximize();
	
	//Click on my account
	driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
	
	
	// click on login
	driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	
	//enter email
	driver.findElement(By.cssSelector("input#input-email")).sendKeys("santosh.hawle@wipro.com");
	
	//enter password
	driver.findElement(By.cssSelector("input#input-password")).sendKeys("wipro@123");
	
	
	//Thread.sleep(4000);
	
	
	//click on login button
	driver.findElement(By.xpath("//input[@value='Login']")).click();

	}

}
