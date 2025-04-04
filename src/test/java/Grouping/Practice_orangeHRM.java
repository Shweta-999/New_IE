package Grouping;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Practice_orangeHRM extends BaseTest {
	
	
  @Test
  public void f() throws InterruptedException {
	  
	  
	  
		WebElement username = driver.findElement(By.xpath(prop.getProperty("Uname")));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath(prop.getProperty("Pword")));
		password.sendKeys("admin123");
		driver.findElement(By.xpath(prop.getProperty("SignInbutton"))).click();
		Thread.sleep(5000);
  }
  
  
  @Test(priority=1)
  public void f2() throws InterruptedException 
  {
	  	 
				driver.findElement(By.xpath(prop.getProperty("AdminButton"))).click();
				Thread.sleep(2000);

		        driver.findElement(By.xpath(prop.getProperty("AddButton"))).click();
				Thread.sleep(5000);

	        	
	        
  }
  
  
  @Test(priority=0)
  public void f3() throws InterruptedException 
  {
	  	 
				driver.findElement(By.xpath(prop.getProperty("PIM"))).click();
				Thread.sleep(2000);

		        driver.findElement(By.xpath(prop.getProperty("AddButton"))).click();
				Thread.sleep(5000);

	      	        
  }
 
 
}
