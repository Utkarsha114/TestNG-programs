package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Steps {
	
	WebDriver driver;
	
	@Given("I am on Login Page")
	public void i_am_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://automationexercise.com/login");
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String uname, String pwd) {
	    driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys(uname);
	    driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys(pwd);
	}

	@When("I click on automationexercise login button")
	public void i_click_on_login_button() {
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
	}

	@Then("Validate result")
	public void validate_result() {
//		System.out.println(driver.getTitle());
//		
//	}

		String actualTitle = driver.getTitle();

		System.out.println(actualTitle);

		if(actualTitle.equals("Automation Exercise")) {

			System.out.println("Login Successful");

			Assert.assertEquals(actualTitle, "Automation Exercise");

		}

		else {

			System.out.println("Login Failed");

			Assert.assertEquals(actualTitle, "Automation Exercise - Signup / Login");
		}
}
}
