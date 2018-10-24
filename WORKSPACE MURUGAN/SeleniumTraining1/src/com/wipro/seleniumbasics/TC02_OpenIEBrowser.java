package com.wipro.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TC02_OpenIEBrowser {

	public static void main(String[] args) {
		
		//01.Set System property - browser specific driver file
		System.setProperty("webdriver.ie.driver", "C:\\Users\\sa541652\\Desktop\\Selenium_77768\\Driver\\IEDriverServer.exe");
	
	//02. Create webdriver instance
	WebDriver driver=new InternetExplorerDriver();
	
	//03. Open browser
	driver.get("https://google.com");
	
	//Type Wipro in search box
	driver.findElement(By.xpath("//input[@dir='ltr' and @name='q']")).sendKeys("Wipro");
	
	//04. Maximixe browser
	driver.manage().window().maximize();
	
	
	//05. Close browser
	driver.close();

	}

}
