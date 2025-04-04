package Test_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_code {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	{
		 System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");
			 			  
	     WebDriver driver= new ChromeDriver();
	     
	     driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     
	     Thread.sleep(2000);
	     
	     driver.manage().window().maximize();
	     
	     
	     
	     WebElement user=driver.findElement(By.xpath("//input[@name=\"username\"]"));
	     
	     user.sendKeys("Admin");
	 	   	  
	           WebElement pass=driver.findElement(By.xpath("//input[@name=\"password\"]"));
	           pass.sendKeys("admin123");
	           
	           WebElement login=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	           login.click();
	           
	           Thread.sleep(5000);
	           driver.navigate().back();
	           
	           Thread.sleep(5000);
	           driver.navigate().forward();
	           
	           Thread.sleep(5000);
	           driver.navigate().refresh();
	 }
     }   
	 }


