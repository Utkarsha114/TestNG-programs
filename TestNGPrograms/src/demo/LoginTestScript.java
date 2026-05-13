package demo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestScript {
	WebDriver driver;
	
	@BeforeTest
	public void start() {
		System.out.println("Test execution starts");
	}
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
  @Test (priority = 1)
  public void validLogin() throws InterruptedException {
	  
	  WebElement username = driver.findElement(By.cssSelector("input[name='uid']"));
		username.sendKeys("mngr660164");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("zAqypym");
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		login.click();
		
  }
  
  @Test (priority = 1, enabled = false)
  public void invalidLogin() throws InterruptedException {
	  
	  WebElement username = driver.findElement(By.cssSelector("input[name='uid']"));
		username.sendKeys("user1");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("pass123");
		
		WebElement login = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		login.click();
		
		Thread.sleep(2000);
		
		Alert al = driver.switchTo().alert();
		al.accept();
  }
  
  @Test 
  public void Logout() {
	  Actions act = new Actions(driver);
	  WebElement logoutbtn = driver.findElement(By.xpath("//a[text()='Log out']"));
	  
	  act.scrollToElement(logoutbtn).perform();
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()", logoutbtn);
  }
  
  @AfterMethod
  public void close() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }
  
  @AfterTest
  public void stop() {
	  System.out.println("Test execution stops");
  }
  
}


// Question: 1st invlaid test case is executed and then valid test case is executed
// Answer: Coz @Test is written for both. so execution is done in alphabetical order. so i -> invalid then v -> valid.
// If we do not want that, then there is concept of attributes
