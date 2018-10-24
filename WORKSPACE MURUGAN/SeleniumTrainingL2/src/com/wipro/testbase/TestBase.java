package com.wipro.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.wipro.unitility.CommonFunctions;

public class TestBase {
	
	public static  WebDriver driver; 
	public static Properties p=new Properties();
	public static CommonFunctions con=new CommonFunctions();
	public static File filepath=new File(System.getProperty("user.dir")+"\\resources\\testdata\\opencart.xlsx");
	public static XSSFSheet sheet;
	public static XSSFWorkbook wbook;
	
	@BeforeSuite
	public static void initializeBrowser() throws Exception {

	//01.Set System property - browser specific driver file
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//resources//driverfiles//chromedriver.exe");

	//02. Create webdriver instance
	driver=new ChromeDriver();

	File f=new File(System.getProperty("user.dir")+ "//resources//config//config.properties");
	
	FileInputStream fis=new FileInputStream(f);
	
	p.load(fis);
	
	
	//03. Open browser
	driver.get(p.getProperty("appurl"));
	
	int t=Integer.parseInt(p.getProperty("implicit_wait"));
	
	driver.manage().timeouts().implicitlyWait(t, TimeUnit.SECONDS);
	
	//04. Maximixe browser
	driver.manage().window().maximize();
	
	FileInputStream fis1=new FileInputStream(filepath);
	
	wbook=new XSSFWorkbook(fis1);
	
	}

	@AfterSuite
	public static void closeBrowser() {
		//05. Close browser
		driver.close();
	}

}
