package com.wipro.basiccompoments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) {
		
		//01.Set System property - browser specific driver file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sa541652\\Desktop\\Selenium_77768\\Driver\\chromedriver.exe");
	
	//02. Create webdriver instance
	WebDriver driver=new ChromeDriver();
	
	//03. Open browser
	driver.get("http://demo.automationtesting.in/Frames.html");
	
	//maximize browser
	driver.manage().window().maximize();
	
	
	driver.switchTo().frame(driver.findElement(By.id("singleframe")));
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("wipro");
	
	driver.switchTo().defaultContent();
	

	}

}
