package Selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A_004_Dropdown_UsingSELECT_CLASS {
public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "c:/Users/mu307892/Desktop/Selenium/Tools software/chromedriver_win32/chromedriver.exe");
		WebDriver DRIVER = new ChromeDriver();
			DRIVER.get("https://www.spicejet.com/");
			DRIVER.manage().deleteAllCookies();
			DRIVER.manage().window().maximize();
			DRIVER.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
			String CURRENTTITLE = DRIVER.getTitle();
			System.out.println("title of the url is captured from browser :" +CURRENTTITLE);
//******************************CODE FOR DROP DOWN******************
			Select DROPDOWN = new Select(DRIVER.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
			DROPDOWN.selectByVisibleText("AED");
			DRIVER.close();
			
//******************************CODE FOR DROP DOWN******************			
			
		    
			
}

}
