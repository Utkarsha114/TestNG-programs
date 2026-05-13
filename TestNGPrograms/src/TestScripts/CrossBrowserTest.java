package TestScripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CrossBrowserTest {
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String browser) {
		if(browser.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		
		else if(browser.equals("Firefox")) {
				driver = new FirefoxDriver();
			}
		else {
			System.out.println("Invalid browser");
		}
	}
	
	@Test
  public void OpenPage() {
		WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(" https://www.facebook.com/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }
	
	
}



// what is assert
//types of assert
//how to manage class in 
