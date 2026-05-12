package com.example.testngcode;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.example.javacode.ReadWriteExcelData;

public class LoginTestScript {
	
	WebDriver driver;
	
  @BeforeTest
  public void setup() throws IOException {
	  driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V1/index.php");
		
		ReadWriteExcelData.getExcel("D:\\Training\\Test.xlsx", "Sheet2");
		
  }
  
  @Test
  public void LoginTc() throws InterruptedException {
	  
	  int rowSize = ReadWriteExcelData.getRowCount();
	  for (int i=1; i<=rowSize;i++) {
		  
		  String uname = ReadWriteExcelData.getData(i, 0);
		  String pwd = ReadWriteExcelData.getData(i, 1);
	 
	  WebElement username = driver.findElement(By.xpath("//input[@name='uid']"));
		//username.sendKeys("mngr660164");
	  	username.sendKeys(uname);

	  
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		//password.sendKeys("zAqypym");
		password.sendKeys(pwd);

		WebElement loginbtn = driver.findElement(By.xpath("//input[@name='btnLogin'] "));
		loginbtn.click();
		
		Thread.sleep(3000);
		try {
			Alert al= driver.switchTo().alert();
			// System.out.println(al.getText());
			
			String actualResult =al.getText();
			ReadWriteExcelData.setData(i, 2, actualResult);
			
			al.accept();
		} catch (Exception e) {
			System.out.println(e);
		}
	  }
  }
  
  
}
