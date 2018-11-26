package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01_OpenChromeBrowser {
	
	public static  void main(String args[]) {
		
		//01.Set System property - browser specific driver file
			System.setProperty("webdriver.chrome.driver", "c:/Users/mu307892/Desktop/Selenium/Tools software/chromedriver_win32/chromedriver.exe");
		
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
