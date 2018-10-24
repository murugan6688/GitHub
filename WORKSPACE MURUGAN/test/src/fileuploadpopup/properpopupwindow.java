package fileuploadpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class properpopupwindow 

{

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","c:/Users/mu307892/Desktop/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:www.popuptest.com/goodpopups.html");
		

	}
	
		
		
}




