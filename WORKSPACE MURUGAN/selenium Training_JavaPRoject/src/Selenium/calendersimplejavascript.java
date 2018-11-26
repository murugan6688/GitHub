package selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class calendersimplejavascript {
		
		public static void main(String[] args)
		{
					System.setProperty("webdriver.chrome.driver", "/Users/mu307892/Desktop/Selenium/chromedriver_win32/chromedriver.exe");
			WebDriver browser = new ChromeDriver();
	
			browser.get("http://freecrm.com");
			String title = browser.getTitle();
		
			WebElement date = browser.findElement(By.id("ct100_maincontent_fromdate"));
			String dateVal= "30-12-2017";
			selectDatebyJS(browser,date,dateVal);
			
		}

		public static void selectDatebyJS(WebDriver browser, WebElement element, String dateVal) 
		{
			JavascriptExecutor js = ((JavascriptExecutor) browser);
			js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');",element);
			
		}

}

