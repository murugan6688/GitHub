package Selenium;

import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@Test(groups= {"wipro","opencart","training"})
	public void login() {
		
		System.out.println("Login");

	}
	
	@Test(groups= {"opencart"})
	public void searchProduct() {
		
		System.out.println("search product");
	}
	
	@Test(groups= {"wipro"})
	public void logout() {
		
		System.out.println("Logout");
	}
	

}
