package seleniumintroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumintroduction 
{
	
	public static void main(String[] args)
	{
	
		System.setProperty ("webdriver.chrome.driver","c:/Users/mu307892/Desktop/Selenium/chromedriver_win32/chromedriver.exe");
	
	
	WebDriver  driver= new ChromeDriver();
		
		driver.get("Https://Phptravels.Com");
		driver.quit();
		Select select = new Select(driver.findElement(By.id("state")));
		select.selectByVisibleText("chennai");
				
		// driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("murugan");
		// driver.findElement(By.xpath("//*[@id="identifierNext"]/content/span"))args
		// driver.findElement(By.)
		
		//*[@id="identifierNext"]/content/span
				
	}
			
}
