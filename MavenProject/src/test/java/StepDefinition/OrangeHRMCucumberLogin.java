package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMCucumberLogin {
WebDriver driver;
	
	@Given("User Navigates On Login Page")
	public void user_navigates_on_OrangeHRM_login_page() throws InterruptedException {
	   
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Thread.sleep(2000);
	    
	}

//	@When("User enters valid username {string}")
//	public void user_enters_username(String uname) throws InterruptedException {
//		
//	
//		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
//		username.sendKeys(uname);
//		
//		//Thread.sleep(2000);
//		
//		
//		
//	}
//
//	@When("User enters Password {string}")
//	public void user_enters_password(String pwd) throws InterruptedException {
//	 
//		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//		password.sendKeys(pwd);
//		
//		//Thread.sleep(2000);
//		
//	}
//
//	@When("User click on OrangeHRM login button")
//	public void user_click_on_login_button() {
//	  
//	    
//	    WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
//		loginbtn.click();
//	}
//
//	@Then("Validates user login successfully")
//	public void validates_user_login_successfully() throws InterruptedException {
//	 
//	    
//	   // Thread.sleep(2000);
//	    System.out.println("Login Successful");
//	    
//	    driver.quit();
//	}
//
//	@When ("User enters username {string}") 
//	public void user_enters_invalid_username(String uname) throws InterruptedException {
//		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
//		username.sendKeys(uname);
//		
//		//Thread.sleep(2000);
//	}
//	
//	@When("User enters Password {string}")
//	public void user_enters_invalid_password(String pass) throws InterruptedException {
//		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//		password.sendKeys(pass);
//		
//		//Thread.sleep(2000);
//	}
//	@Then("User is not login")
//	public void user_is_not_login() throws InterruptedException {
//		
//	}
//
//	@When("User enters username {string}")
//	public void user_enters_username(String string) {
//	   
//	}
//	@When("User enters Password {string}")
//	public void user_enters_password(String string) {
//	    
//	}
//	
//	@When("User enters username {string}")
//	public void user_enters_username(String string) {
//	    
//	}
//	@When("User enters Password {string}")
//	public void user_enters_password(String string) {
//	    
//	}
//
//	@When("User enters username {string}")
//	public void user_enters_username(String string) {
//	    
//	}
//	@When("User enters Password {string}")
//	public void user_enters_password(String string) {
//	    
//	}
//
//	
}
