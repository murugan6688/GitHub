package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowndemo {

	public static void main(String[] args) {
		
		//01.Set System property - browser specific driver file
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sa541652\\Desktop\\Selenium_77768\\Driver\\chromedriver.exe");
	
	//02. Create webdriver instance
	WebDriver driver=new ChromeDriver();
	
	//03. Open browser
	driver.get("http://spezicoe.wipro.com:81/abantecart/index.php?rt=account/create");
	
	//maximize browser
	driver.manage().window().maximize();
	
	
	List<WebElement> list=driver.findElements(By.xpath("//select[@id='AccountFrm_country_id']"));
	
	
	System.out.println(list.size());
	
	
WebElement element=driver.findElement(By.xpath("//select[@id='AccountFrm_country_id']"));
	
	Select s=new Select(element);
	
	s.selectByVisibleText("Hong Kong");

	}

}
