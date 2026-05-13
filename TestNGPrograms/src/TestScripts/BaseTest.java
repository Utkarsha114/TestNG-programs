package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


// related files- MyListeners, LoginTest
// this is configuration file. so  execution is done from LoginTest file

public class BaseTest {
	
	// create a static driver for extending the driver in screenshots code
	public static WebDriver driver;
	
	@BeforeTest
	  public void start() {
		 driver = new ChromeDriver();
		  driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/V1/index.php");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
}
