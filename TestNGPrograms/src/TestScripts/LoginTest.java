package TestScripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//related files- MyListeners, BaseTest
// execution is done from this file

@Listeners(MyListener.class)
public class LoginTest extends BaseTest{
	
  
	
@Test (priority = 1)
public void validLogin() throws InterruptedException {
	  
	  WebElement username = driver.findElement(By.cssSelector("input[name='uid']"));
		username.sendKeys("mngr660164");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("zAqypym");
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		login.click();
		
		Assert.assertTrue(true);
}
@Test (priority = 3)
public void invalidLogin() throws InterruptedException {
	  
	  WebElement username = driver.findElement(By.cssSelector("input[name='uid']"));
		username.sendKeys("user1");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("pass123");
		
		WebElement login = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		login.click();
		
		Thread.sleep(2000);
		
//		Alert al = driver.switchTo().alert();
//		al.accept();
//		
		// Assert.assertTrue(true);   //this will never fail. it is always true. 
		
		Assert.fail("Forcing failure to capture screenshot");
	}

@Test (priority = 2)
public void Logout() throws InterruptedException {
	String expectedTitle = "GTPL Bank Manager HomePage";
	String actualTitle = driver.getTitle();
	
	Assert.assertEquals(actualTitle,expectedTitle);
	
	Thread.sleep(2000);
	  Actions act = new Actions(driver);
	  
	  WebElement logoutbtn = driver.findElement(By.xpath("//a[text()='Log out']"));
	  act.scrollToElement(logoutbtn).perform();
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].click()", logoutbtn);

	  Assert.assertTrue(true);


  }
}
