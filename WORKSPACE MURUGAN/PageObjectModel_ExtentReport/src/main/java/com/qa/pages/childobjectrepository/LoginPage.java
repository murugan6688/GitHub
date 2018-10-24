// object repository

package com.qa.pages.childobjectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ParentTestBase.Parent;

public class LoginPage extends Parent {
	 
	 		@FindBy(name="username")
	 		WebElement username;

	 		@FindBy(name="password")
	 		WebElement password;
	 		
	 		@FindBy(xpath="//input[@type='submit']")
	 		WebElement loginBtn;
	 		
	 		@FindBy(xpath="//button[contains(text(),'SignUp')]")
	 		WebElement signupBtn;
	 		
  public LoginPage(){
	  PageFactory.initElements(browser, this);
	  	 			
	 }	
	public String validateloginpagetitle()
	{
		return browser.getTitle();
	}
	
	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
				
	}
}