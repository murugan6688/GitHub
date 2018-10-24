package com.wipro.basiccompoments;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUploadDemo {

	public static void main(String[] args) {
	
		//01.Set System property - browser specific driver file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sa541652\\Desktop\\Selenium_77768\\Driver\\chromedriver.exe");
	
		Proxy p=new Proxy();
		p.setHttpProxy("pdc-proxy.wipro.com:8080");
		
		ChromeOptions cap=new ChromeOptions();
		cap.setProxy(p);
		
		
	//02. Create webdriver instance
	WebDriver driver=new ChromeDriver(cap);
	
	//03. Open browser
	driver.get("http://demo.guru99.com/test/upload/");
	
	//maximize browser
	driver.manage().window().maximize();
	
	try {
		
	WebElement element=driver.findElement(By.name("uploadfile_0"));
	 element.sendKeys("D:\\abc.doc");
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
	
	
	}

}
