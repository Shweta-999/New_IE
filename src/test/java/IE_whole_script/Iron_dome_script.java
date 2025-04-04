package IE_whole_script;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Iron_dome_script {
	
	WebDriver driver=new ChromeDriver();
	
	// To Create Audience navigation

  @Test (priority=0, groups = {"Regression"})
  public void f() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//a[@href='/Search/Create']")).click();
	  
	  Thread.sleep(5000);
	  
    //  Create Audience page

	  WebElement name=driver.findElement(By.xpath("//input[@name=\"Name\"]"));
	  
	  name.sendKeys("TestAudMarch11");
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//label/span[contains(.,\"Direct Mail\")]")).click();
	  
	  driver.getPageSource().contains("Mail Piece for Direct Mail: Compliant.");
	  
      Thread.sleep(2000);
      
	  driver.findElement(By.xpath("//div/button[contains(.,\"Save & Continue\")]")).click();
	  
	  Thread.sleep(2000);
  }
  
  // Geography Selection

  @Test (priority=1, groups = {"Regression"})
  public void f1() throws InterruptedException {  
	  
	    driver.findElement(By.xpath("//select/option[contains(.,\"ALABAMA\")]")).click();
	  
		driver.findElement(By.xpath("//li/a[@href='#globalrejects']")).click();
		
		Thread.sleep(2000);
  }
  
  //Credit criteria selection

  @Test (priority=2, groups = {"Regression"})
  public void f2() throws InterruptedException {  
	  
	  WebElement ficomin=driver.findElement(By.xpath("//div/input[@name=\"21-min\"]"));
	  
	  ficomin.sendKeys("600");
		
	  Thread.sleep(2000);
	  
	  WebElement ficomax=driver.findElement(By.xpath("//div/input[@name=\"21-max\"]"));
	  
	  ficomax.sendKeys("650");
	  
	  driver.findElement(By.xpath("//div/button[contains(.,\"Save & Continue\")]")).click();
	 
	  Thread.sleep(2000);

  }
  
  //Define Level

    @Test (priority=3, groups = {"Regression"})
  public void f3() throws InterruptedException {  
	  
	  driver.findElement(By.xpath("//li/a[@href='#levelcriteria']")).click();
	  
	  Thread.sleep(2000);

  }
  
  //Credit criteria selection

  @Test (priority=4, groups = {"Regression"})
  public void f4() throws InterruptedException {  
	  
		WebElement crieriaficomin=driver.findElement(By.xpath("//div/input[@name=\"21-min\"]"));
		
		crieriaficomin.sendKeys("600");
		
		Thread.sleep(2000);
		
		WebElement crieriaficomax=driver.findElement(By.xpath("//div/input[@name=\"21-max\"]"));
		
		crieriaficomax.sendKeys("650");

  }
  
   
  
  @BeforeSuite
  public void beforeSuite() throws InterruptedException {
	  
	  
	  driver.get("https://intelidataexpress.beta.datamyx.com/");
    //   Before Class
      driver.manage().window().maximize();
      
      //in test
      
      WebElement username=driver.findElement(By.id("Username"));
      
	  username.sendKeys("Sbhujbal");
		
	  WebElement password=driver.findElement(By.id("Password"));
	  
	  password.sendKeys("Test@123");
	  
	  driver.findElement(By.xpath("//div[@class='text-center my-4']")).click();
	  
	  Thread.sleep(5000);

	    }

  @AfterSuite
  public void afterSuite() {
	  
   driver.quit();

	  
	  
  }

}
