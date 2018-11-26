package popupalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class managepopups {
		public static void main(String[] args) throws InterruptedException
		{

		System.setProperty("webdriver.chrome.driver","c:/Users/mu307892/Desktop/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.rediff.com");
		driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]")).click();
		driver.findElement(By.name("proceed")).click();
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		Thread.sleep(5000);
		String text = popup.getText();
				if (text.equals("please enter valid user name")) 
				{
					
					System.out.println("good");
				}
				else
				{
					System.out.println("bad");
				}	
		
		popup.accept();
		
}
	
}

