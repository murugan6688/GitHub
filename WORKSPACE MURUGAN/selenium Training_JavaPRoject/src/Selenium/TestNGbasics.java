package comTestNg;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGbasics {

	@BeforeSuite
	public void launchbrowser1()
	{
		System.out.println("Browserlaunched1");
			}
	
	@BeforeClass
	public void launchbrowser2()
	{
		System.out.println("Browserlaunched2");
				
	}

	@BeforeMethod
	public void launchbrowser3()
	{
		System.out.println("Browserlaunched3");
				
	}

	@BeforeTest
	public void launchbrowser4()
	{
		System.out.println("Browserlaunched4");
				
	}

	@Test (priority=1,groups = "reg pack")
	public void launchbrowser5()
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/mu307892/Desktop/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver Browser =  new ChromeDriver();
		Browser.get("http://www.google.com");
		String B = Browser.getTitle();
		Browser.close();
	}
	@Test(priority=2,groups = "reg pack")
	public void launchbrowser12()
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/mu307892/Desktop/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver Browser =  new ChromeDriver();
		Browser.get("http://www.flipkart.com");
		Browser.close();
		
		String s = Browser.getTitle();
	
		
		}
	
	
	@Test(priority=3,dependsOnMethods="launchbrowser12")
	public void launchbrowser13()
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/mu307892/Desktop/Selenium/chromedriver_win32/chromedriver.exe");
		WebDriver Browser =  new ChromeDriver();
		Browser.get("http://www.amazon.co.in");
		Browser.close();	
						}
		
	@AfterMethod
	public void launchbrowser6()
	{
		System.out.println("Browserlaunched3");
				
	}

	@AfterTest
	public void launchbrowser7()
	{
		System.out.println("Browserlaunched4");
				
	}
	
	@AfterSuite
	public void launchbrowser8()
	{
		System.out.println("Browserlaunched1");
			}
	
	@AfterClass
	public void launchbrowser9()
	{
		System.out.println("Browserlaunched2");
				
	}








}
