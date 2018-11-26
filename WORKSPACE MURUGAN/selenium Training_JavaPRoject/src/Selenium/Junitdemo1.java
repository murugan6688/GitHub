package com.wipro.junitdemos;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junitdemo1 {
	
	@Test
	public void test1()
	{
		System.out.println("In Test 1");
	}
	
	@Test(timeout=10)
	public void test2() throws InterruptedException
	{
		Thread.sleep(20);
		
		System.out.println("In Test 2");
	}

	@BeforeClass
	public static void  beforeTest() {
		System.out.println("Initializeing test");
	}
	
	@AfterClass
	public static void afterTest() {
		System.out.println("Closing Test");
	}
	
}
