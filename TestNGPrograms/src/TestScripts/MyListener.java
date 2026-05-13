package TestScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

//related files- BaseTest, LoginTest
//execution is done from LoginTest file

//  this is configuration file. so execution  is done with LoginTest.java in TestScripts package


public class MyListener implements ITestListener {
  
	// Listeners are used to display the tests results in proper format
	
	@Override
  public void onTestStart(ITestResult result) {
		System.out.println("Test started:" + result.getName());
		}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed:" + result.getName());
	}
	
	@Override 
	public void onTestFailure(ITestResult result) {
		// add code for screenshot- 4lines code
		
		// taken from BaseTest.java as inheritance
		WebDriver driver = BaseTest.driver;
				// Take screenshot 
				TakesScreenshot ts = (TakesScreenshot) driver;
				
				File f1 = ts.getScreenshotAs(OutputType.FILE);
				
				File dest = new File("C:\\Users\\Nabla Infotech\\Pictures\\Screenshots\\testNG_Listener.jpg");
				
				try {
					FileHandler.copy(f1, dest);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("Screenshot captured");
				
				
		System.out.println("Test Failure:" + result.getName());
	}
}
