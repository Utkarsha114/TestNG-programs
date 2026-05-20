package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestScript {
	
	WebDriver driver;
	
	@Given("User Navigates On Login Page")
	public void user_navigates_on_login_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Thread.sleep(2000);
	    
	}

	@When("User enters valid username {string}")
	public void user_enters_valid_username(String uname) throws InterruptedException {
		
		// Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(uname);
		
		//Thread.sleep(2000);
		
		
		
	}

	@When("User enters valid Password {string}")
	public void user_enters_valid_password(String pwd) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(pwd);
		
		//Thread.sleep(2000);
		
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	    
	    WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbtn.click();
	}

	@Then("Validates user login successfully")
	public void validates_user_login_successfully() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	    
	   // Thread.sleep(2000);
	    System.out.println("Login Successful");
	    
	    //driver.quit();
	}

}
