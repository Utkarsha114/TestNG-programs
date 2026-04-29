package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99Application {

	WebDriver driver;
	
	@Test
	public void loginTc() {
		
		WebElement username = driver.findElement(By.xpath("//input[@name='uid']"));
		username.sendKeys("mngr660164");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("zAqypym");
		
		WebElement loginbtn = driver.findElement(By.xpath("//input[@name='btnLogin'] "));
		loginbtn.click();
		
	}
	
	@BeforeTest
	public void beforeTest() {
		driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V1/index.php");
		
	}
	
	@AfterTest 
	public void afterTest() {
		System.out.println("Execution stops");
	}

}
