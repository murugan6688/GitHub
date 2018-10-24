package com.wipro.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_OpenChromeBrowser {
	
	public static  void main(String args[]) {
		
		//01.Set System property - browser specific driver file
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sa541652\\Desktop\\Selenium_77768\\Driver\\chromedriver.exe");
		
		//02. Create webdriver instance
		WebDriver driver=new ChromeDriver();
		
		//03. Open browser
		driver.get("https://google.com");
		
		//04. Maximixe browser
		driver.manage().window().maximize();
		
		
		
		//05. Close browser
		driver.close();
	}

}
