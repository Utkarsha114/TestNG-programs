package com.example.javacode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99NewCustomer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V1/html/addcustomerpage.php");
		
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		//name.sendKeys("Utkarsha");
		
		WebElement gender = driver.findElement(By.xpath("//input[@name='rad1']"));
		gender.click();
		
		WebElement dob = driver.findElement(By.xpath("//input[@name='dob']"));
		//dob.sendKeys("10-05-2026");
		
		WebElement addr = driver.findElement(By.xpath("//textarea[@name='addr']"));
		//addr.sendKeys("Pimpri Chinchwad");
		
		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		//city.sendKeys("Pune");
		city.sendKeys(ReadWriteData.getData(0,4));
		
		WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
		//state.sendKeys("Maharashtra");
		
		WebElement pin = driver.findElement(By.xpath("//input[@name='pinno']"));
		//pin.sendKeys("411028");
		
		WebElement phone = driver.findElement(By.xpath("//input[@name='telephoneno']"));
		//phone.sendKeys("9112345654");
		phone.sendKeys(ReadWriteData.getData(0,6));
		
		WebElement email = driver.findElement(By.xpath("//input[@name='emailid']"));
		//email.sendKeys("utkarsha12@gmail.com");
		email.sendKeys(ReadWriteData.getData(0,7));
		
		Thread.sleep(3000);
		
		WebElement submit = driver.findElement(By.xpath("//input[@name='sub']"));
		submit.click();

	}
	
	

}
