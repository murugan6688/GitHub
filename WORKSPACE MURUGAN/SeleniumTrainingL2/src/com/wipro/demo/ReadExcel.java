package com.wipro.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		File filepath=new File(System.getProperty("user.dir")+"\\resources\\testdata\\opencart.xlsx");
		
		FileInputStream fis=new FileInputStream(filepath);
		
		XSSFWorkbook wbook=new XSSFWorkbook(fis);
		
		
	XSSFSheet sheet=	wbook.getSheet("Login");
		
	String email=sheet.getRow(1).getCell(0).getStringCellValue();
	System.out.println(email);
		

	}

}
