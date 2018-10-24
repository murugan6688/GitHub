package com.wipro.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wipro.testbase.TestBase;
import com.wipro.unitility.CommonFunctions;

public class TC01_LoginToOpencart extends TestBase{

	
	@DataProvider(name="santosh")
	public Object[][] getData(){
		
		return new Object[][] {
			
			{"santosh.hawle@wipro.com","wipro@123"},
			{"santosh.hawle@wipro.com","wipro@123"},
			{"santosh@wipro.com","wipro@123"}
			
		};
	}
	
	
	
	@Test(dataProvider="santosh")
	public void loginTest(String email, String pass) throws IOException {

	
	//Click on my account
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		
		
		// click on login
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
		
		//enter email
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(email);
		Reporter.log("Entered the email ID "+email);
		Reporter.log("<br>");
		
		
		//enter password
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(pass);
		Reporter.log("Entered the password");
		Reporter.log("<br>");
	
		//click on login button
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Reporter.log("Clicked on login button");
		Reporter.log("<br>");
	
		con.captureScreenshot();
		
		//Click on my account
				driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
				
		//click on logout
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
				
		Reporter.log("Clicked on logout");
		Reporter.log("<br>");

	
	}
	
	
}
