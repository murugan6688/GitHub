package Selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_002_openwebpage_using_GET {
public static void main(String[] args) 
	{
			System.setProperty("webdriver.chrome.driver", "c:/Users/mu307892/Desktop/Selenium/Tools software/chromedriver_win32/chromedriver.exe");
			WebDriver DRIVER = new ChromeDriver();
/////**************************************USING GET OPTION******************************************
			DRIVER.get("https://www.google.com/");
/////**************************************USING GET OPTION******************************************			
			DRIVER.manage().deleteAllCookies();
			DRIVER.manage().window().maximize();
			DRIVER.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
			String CURRENTTITLE = DRIVER.getTitle();
			System.out.println("title of the url is captured from browser :" +CURRENTTITLE);
			
}

}
