package demo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	WebDriver driver; 
	
	//addition example
  /* @Test(dataProvider = "AddData")
  public void add(int a, int b, int exp) {
	  int actualresult = a+b;  //actual test case. Only data changes
	  
	  Assert.assertEquals(actualresult, exp);  
	  }
  
  @DataProvider(name = "AddData")
  	public Object[][] testData() {   //Object[][] is a object 2D array. predefined in java. It is a root class. it is return type
  		return new Object[][] {
  			{3,4,6}, //string data will also be accepted
  			{7,2,6},
  			{4,4,8}
  		};  */
  		
  		
 	
	
	// login scenario test
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V1/index.php");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(dataProvider = "AddData")
	public void LoginTest(String username, String password, String exp) throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(username);
	
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnLogin'] ")).click();
		
		Thread.sleep(2000);
		try {
			Alert al =driver.switchTo().alert();
			al.accept();
		} catch (Exception e) {
			System.out.println(e);
		}
		Assert.assertEquals(driver.getTitle(),exp);
  	}
	
	@DataProvider(name = "AddData")
  	public Object[][] testData() {   //Object[][] is a object 2D array. predefined in java. It is a root class. it is return type
  		return new Object[][] {
  			{"user1","Pass1","GTPL Bank Home Page"}, //string data will also be accepted
  			{"user2","Pass2","GTPL Bank Home Page"},
  			{"mngr660164","zAqypym","GTPL Bank Manager HomePage"}
  		}; 
	}
}
