package Selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class A_001_Launchbrowser_safari_browser {
public static void main(String[] args) 
	{
////////////////********************Code for safari has to be written********************//
	// install safari browser
	// install safari driver
	// use safari extension
	// need to enable allow remote automation 
	// WebDriver Driver = new SafariDriver();
			WebDriver DRIVER = new SafariDriver();
			DRIVER.get("https://www.google.com/");
			DRIVER.manage().deleteAllCookies();
			DRIVER.manage().window().maximize();
			DRIVER.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
			String CURRENTTITLE = DRIVER.getTitle();
			System.out.println("title of the url is captured from browser :" +CURRENTTITLE);
			
		    
			
}

}
