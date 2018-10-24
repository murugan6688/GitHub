import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.io.File;// to mention the file location where it can be stored 
import java.io.FileInputStream; // to mention the file location from which it can be loaded
import java.io.IOException; // to load the exceptions
import java.util.Properties; // to load the properties 

import org.apache.commons.io.FileUtils; // to copy the file to a specified location
import org.openqa.selenium.OutputType; // to mention the type of copy
import org.openqa.selenium.TakesScreenshot; // to take screen shot


public class initali
{
	WebDriver browser = new ChromeDriver();
	

	
	public void screensht()
	{
		
	File SRC = ((TakesScreenshot)browser).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(SRC, new File("c://murugan");
	
	Properties p = new Properties();
	FileInputStream FIS = new FileInputStream(System.getProperty("user.dir") + "c:/murugan"));
	p.load(FIS);
	
	
	
	
	
	
	}
}