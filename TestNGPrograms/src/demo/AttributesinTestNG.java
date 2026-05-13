package demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AttributesinTestNG {
	WebDriver driver;
	
  @Test (priority = 1)
  public void validLoginTc() throws InterruptedException {
	  WebElement username = driver.findElement(By.cssSelector("input[name='uid']"));
		username.sendKeys("mngr660164");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("zAqypym");
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		login.click();
		
		Thread.sleep(2000);
		
		try {
			Alert al = driver.switchTo().alert();
			al.accept();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		String expectedTitle ="GTPL Bank Manager HomePage";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
  }
  
  @BeforeTest
  public void setup() {
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/V1/index.php");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  
  @Test (priority=2, dependsOnMethods="validLoginTc")
  public void Logout() {
	  Actions act = new Actions(driver);
	  WebElement logoutbtn = driver.findElement(By.xpath("//a[text()='Log out']"));
	  
	  act.scrollToElement(logoutbtn).perform();
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()", logoutbtn);
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(2000);
	  driver.close();
  }

}
