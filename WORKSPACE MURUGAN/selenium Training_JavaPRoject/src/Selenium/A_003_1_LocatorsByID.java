package Selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_003_1_LocatorsByID {
public static void main(String[] args) 
	{
			System.setProperty("webdriver.chrome.driver", "c:/Users/mu307892/Desktop/Selenium/Tools software/chromedriver_win32/chromedriver.exe");
			WebDriver DRIVER = new ChromeDriver();			
			DRIVER.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
			DRIVER.manage().deleteAllCookies();
			DRIVER.manage().window().maximize();
			DRIVER.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
			String CURRENTTITLE = DRIVER.getTitle();
			System.out.println("title of the url is captured from browser :" +CURRENTTITLE);
//2.Locator by id
			DRIVER.findElement(By.id("lastname")).sendKeys("lastname");			
	
}

}
