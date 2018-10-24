package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class googlesearchinput {


		
		public static void main(String[] args)
		{
					System.setProperty("webdriver.chrome.driver", "/Users/mu307892/Desktop/Selenium/chromedriver_win32/chromedriver.exe");

			WebDriver browser = new ChromeDriver();
			
			browser.get("http://freecrm.com");
			String title = browser.getTitle();
			Boolean resultforisDisplayed = browser.findElement(By.name("username")).isDisplayed();
			Boolean resultforisDisplayed4 = browser.findElement(By.name("username")).isEnabled();
			Boolean resultforisEnabled2 = browser.findElement(By.name("password")).isSelected();
			Boolean resultforisSelected3 = browser.findElement(By.xpath("//input[@value='Login']")).isDisplayed();

			browser.findElement(By.xpath("//a[contains(text(),'xxxx xxxx')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
			
			List <WebElement> list = browser.findElements(By.xpath("//ul[@role='listbox')]//li/descendant::div[@class='xxx_y']"));
					
			browser.findElement(By.id("lst-ib")).sendKeys("Java");
			
			System.out.println(title);
			
			
		}

	}

}
