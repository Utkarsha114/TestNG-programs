package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	int a=5;
	int b=4;
	
  @Test
  public void add() {
	  int actualResult = a+ b;
	  int expectedResult = 9;
	  
	  if(actualResult == expectedResult) {
		  System.out.println("Test Pass");
	  }
	  else {
		  System.out.println("Test Fail");
	  }
	  
	  Assert.assertEquals(actualResult, expectedResult);
  }
}
