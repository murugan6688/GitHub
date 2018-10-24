package com.wipro.basiccompoments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) {
	
		//01.Set System property - browser specific driver file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sa541652\\Desktop\\Selenium_77768\\Driver\\chromedriver.exe");
	
	//02. Create webdriver instance
	WebDriver driver=new ChromeDriver();
	
	//03. Open browser
	driver.get("http://spezicoe.wipro.com:81/opencart1/");
	
	//maximize browser
	driver.manage().window().maximize();
	
	//Click on my account
	driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
	
	
	driver.findElement(By.linkText("Register")).click();
	
	driver.findElement(By.xpath("//input[@name='newsletter']")).click();
	
	
	if(driver.findElement(By.xpath("//input[@name='newsletter']")).isSelected()) {
		System.out.println("Newsletter is subscribed");
	}
	else
	{
		System.out.println("Newsletter is not subscribed");	
	}
	

	}

}
