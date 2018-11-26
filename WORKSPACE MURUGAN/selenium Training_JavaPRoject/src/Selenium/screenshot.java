package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {

		WebDriver browser = new ChromeDriver();
		
		
						
public void fail() {
		Properties prop = new Properties();
		FileInputStream fi = new FileInputStream (System.getProperty("user.dir")+"strc/asdsad/asdasd/");
		prop.load(fi);
		}
	
		File sourcefile = ((TakesScreenshot)browser).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile (sourcefile, new File("c://murugan"));
}
