import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitsample {

	public static void main(String[] args) {
		//01.Set System property - browser specific driver file
		System.setProperty("webdriver.chrome.driver\", \"/Users/mu307892/Desktop/Selenium/chromedriver_win32/chromedriver.exe");
	
	//02. Create webdriver instance
	WebDriver driver=new ChromeDriver();
	
	//03. Open browser
	driver.get("http://spezicoe.wipro.com:81/opencart1/");
	
	//maximize browser
	driver.manage().window().maximize();
	
	String originalwindow=driver.getWindowHandle();
		

	//driver.findElement(By.xpath("//body")).sendKeys(Keys.CONTROL + "T");
	
	((JavascriptExecutor)driver).executeScript("window.open();");
	
	((JavascriptExecutor)driver).executeScript("window.open();");
	
	((JavascriptExecutor)driver).executeScript("window.open();");
	
	((JavascriptExecutor)driver).executeScript("window.open();");
	
	
	Set<String> tabs=driver.getWindowHandles();
	
	System.out.println(tabs.size());
	
	driver.switchTo().window(originalwindow);
	
	Iterator<String> i=tabs.iterator();
	
	String tab=i.next();
	
	driver.switchTo().window(tab);
		
	}

}
