package Selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class A_001_Launchbrowser_firefox_browser {
public static void main(String[] args) 
	{
			System.setProperty("webdriver.gecko.driver", "C:/Users/mu307892/Desktop/Selenium/Tools software/geckodriver-v0.23.0-win64/geckodriver.exe");
			WebDriver DRIVER = new FirefoxDriver();	
	
			DRIVER.get("https://www.google.com/");
			DRIVER.manage().deleteAllCookies();
			DRIVER.manage().window().maximize();
			DRIVER.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
			String CURRENTTITLE = DRIVER.getTitle();
			System.out.println("title of the url is captured from browser :" +CURRENTTITLE);
			
		    
			
}

}
