package com.qa.Testcase;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.qa.ParentTestBase.Parent;
import com.qa.pages.childobjectrepository.HomePage;
import com.qa.pages.childobjectrepository.LoginPage;

public class Logintestcase extends Parent {

	LoginPage objref_loginpage;
	
	HomePage objref_homepage;
	Logger log = Logger.getLogger(Logintestcase.class);
	public Logintestcase(){
		super(); // step:1 used to call the super class constructor 
		// i.e parent class so that properties is enabled
	}
	
	@BeforeMethod
	public void setup(){
		initialise(); //Step:2 this will be initalised and this is from LoginPage.java
		objref_loginpage = new LoginPage();
		
	}
	@Test
	public void loginpagetitletest(){
		log.info("************************starting first testcase*********************");		
		String title = objref_loginpage.validateloginpagetitle();
		
				Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
	}
	
	@Test
	public void validatelogin(){
		log.info("********************starting second test case*****************************");
		objref_homepage = objref_loginpage.login(objectref_toopenconfigproperties.getProperty("username"), objectref_toopenconfigproperties.getProperty("password"));
		
			}
	@AfterMethod   
	public void close(){
		browser.quit();
			}
	
	}
	
	

