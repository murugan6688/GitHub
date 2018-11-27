package Selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_003_1_LocatorsByXPATH_RELATIVE {
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
// 3.Locator by xpath (Absolute xpath should not be used e.g: xpath is like *[@id="agreeComp"]/div/a[2])
// below code is relative XPATH
			DRIVER.findElement(By.xpath ("//*[@id='email']")).sendKeys("firstlast@gmail.com");
			DRIVER.findElement(By.xpath("//*[@id='PASSWORD']")).sendKeys("wordpass@1234");
			DRIVER.findElement(By.xpath("//*[@id='ppaFormSbtBtn']")).click();
			
}

}
