package com.example.javacode;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99NewCustomer {

	//related page- ReadWriteCustomer.java
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V1/html/addcustomerpage.php");
		
		ReadWriteCustomer.getExcel("D:\\Training\\Test.xlsx", "Sheet3");
		
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		//name.sendKeys("Utkarsha");
		name.sendKeys(ReadWriteCustomer.getData(0,0));
		
		WebElement gender = driver.findElement(By.xpath("//input[@name='rad1']"));
		gender.click();
		
		WebElement dob = driver.findElement(By.xpath("//input[@name='dob']"));
		//dob.sendKeys("10-05-2026");
		dob.sendKeys(ReadWriteCustomer.getData(0, 2));
		
		WebElement addr = driver.findElement(By.xpath("//textarea[@name='addr']"));
		//addr.sendKeys("Pimpri Chinchwad");
		addr.sendKeys(ReadWriteCustomer.getData(0, 3));
		
		WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
		//city.sendKeys("Pune");
		city.sendKeys(ReadWriteCustomer.getData(0,4));
		
		WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
		//state.sendKeys("Maharashtra");
		state.sendKeys(ReadWriteCustomer.getData(0, 5));
		
		WebElement pin = driver.findElement(By.xpath("//input[@name='pinno']"));
		//pin.sendKeys("411028");
		pin.sendKeys(ReadWriteCustomer.getData(0, 6));
		
		WebElement phone = driver.findElement(By.xpath("//input[@name='telephoneno']"));
		//phone.sendKeys("9112345654");
		phone.sendKeys(ReadWriteCustomer.getData(0,7));
		
		WebElement email = driver.findElement(By.xpath("//input[@name='emailid']"));
		//email.sendKeys("utkarsha12@gmail.com");
		email.sendKeys(ReadWriteCustomer.getData(0,8));
		
		Thread.sleep(3000);
		
		// refresh page and execute loop for multiple users
		
		
		//WebElement submit = driver.findElement(By.xpath("//input[@name='sub']"));
		//submit.click();

	}
	
	

}
