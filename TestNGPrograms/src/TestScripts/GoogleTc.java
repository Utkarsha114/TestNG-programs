package TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTc {
	WebDriver driver;
  @Test
  public void OpenPage() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(" https://www.google.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  
  @Test
  public void verifyPageitle() {
	  Assert.assertEquals(driver.getTitle(),"Google");
}
}
