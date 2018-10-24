package com.qa.ParentTestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.Testcase.Logintestcase;
import com.qa.util.testutil;

public class Parent {
	public static WebDriver browser;
	public static Properties objectref_toopenconfigproperties;
	public static Logger log = Logger.getLogger(Logintestcase.class);
	
		public Parent(){
				try {
					objectref_toopenconfigproperties = new Properties();
					FileInputStream Objectref_configpropertiesfile = new FileInputStream("C:/Users/mu307892/Documents/GitHub/test/.git/PageObjectModel/src/main/java/com/qa/config/config.properties");
					objectref_toopenconfigproperties.load(Objectref_configpropertiesfile);
					
				} catch (FileNotFoundException e) {
										e.printStackTrace();
				} catch (IOException e){
						e.printStackTrace();
						}
	}
		public static void initialise(){
			String browsername=objectref_toopenconfigproperties.getProperty("browser");
			log.info("************************starting first testcase*********************");
			
			if (browsername.equals("chrome")){
				System.setProperty("webdriver.chrome.driver","c:/Users/mu307892/Desktop/Selenium/Tools software/chromedriver_win32/chromedriver.exe");
				browser = new ChromeDriver();
							}
				else if (browsername.equals("firefox")){
					System.setProperty("webdriver.chrome.driver","c:/Users/mu307892/Desktop/Selenium/Tools software/chromedriver_win32/chromedriver.exe");
				browser = new FirefoxDriver();
				}
				
		browser.manage().deleteAllCookies();
		browser.manage().window().maximize();
		browser.manage().timeouts().pageLoadTimeout(testutil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		browser.manage().timeouts().implicitlyWait(testutil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		browser.get(objectref_toopenconfigproperties.getProperty("url"));
		
		}
	}

