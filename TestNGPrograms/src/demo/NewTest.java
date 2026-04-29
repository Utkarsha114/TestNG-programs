package demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {

	@Test
	public void testCase1() {
		System.out.println("login");
	}
	
	@Test 
	public void testCase2() {
		System.out.println("forgot password");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@AfterTest 
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@Test
	public void testCase3() {
		System.out.println("Logout Test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod 
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	
}
