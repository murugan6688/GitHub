package com.wipro.junitdemos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FirstJUnitTest {

	@Test
	public void c() {
		System.out.println("Welcome to JUnit");
	}
	
	@Test
	public void a() {
		{
			System.out.println("Welcome to Test 2");
		}
	}
	
	@Test
	public void b() {
		
		System.out.println("Welcome to Test 3");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("Before Test");
	}

}
