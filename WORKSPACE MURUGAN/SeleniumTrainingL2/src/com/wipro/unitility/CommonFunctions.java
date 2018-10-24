package com.wipro.unitility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot ;
import org.testng.annotations.Test;

import com.wipro.testbase.TestBase;

public class CommonFunctions extends TestBase{
	
	

	public void captureScreenshot() throws IOException {
		
		(TakesScreenshot)driver.
		
		 Date date= new Date();
		 long time = date.getTime();
		Timestamp ts = new Timestamp(time);
		
		String sname=ts.toString().replace(" ","_").replace(":","_");
		
		
		String screenshotName=sname+".jpg";
		
		File destinationPath=new File(System.getProperty("user.dir")+"//resources//screenshots//"+screenshotName);
		
		File sourcePath=screenshot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(sourcePath, destinationPath);
		
		
	}
	
	
	public static int getRows() {
		
		sheet=	wbook.getSheet("Login");
		int rows=sheet.getLastRowNum();
		return rows;
		
	}
	

	public static int getCols() {
		
		sheet=	wbook.getSheet("Login");
		int cols=sheet.getRow(1).getLastCellNum();
		return cols;
		
	}
	
	public static String getData(int colNum, int rowNum) {
		sheet=wbook.getSheet("Login");
		String data=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		return data;
	}
	

}
