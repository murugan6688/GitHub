package com.wipro.testcases;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.wipro.testbase.TestBase;

@Test
public class TC02_SearchProduct extends TestBase{
public void searchProcdut() throws IOException {

	driver.findElement(By.name("search")).sendKeys("Apple");
	Reporter.log("Typed Apple is search textbox");
	
	driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();

	con.captureScreenshot();
}
	
}
