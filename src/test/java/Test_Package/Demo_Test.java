package Test_Package;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Demo_Test {
	
	  WebDriver wd=new ChromeDriver();

  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");
	  
	 
	  wd.manage().window().maximize();
	  
	  wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  wd.get("https://www.google.com/");
	  
	  wd.findElement(By.xpath("//*[@id=\"APjFqb\"]")).click();
	  
	  wd.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("audienceName");

  }
	   

  }
			
		


