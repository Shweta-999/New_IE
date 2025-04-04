package Prerequisites;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;

public class AllClassesinOne {
	
	WebDriver driver = new ChromeDriver();
	
	Properties po = new Properties();

	 	

//Login
  @Test
  public void f() throws InterruptedException {
	  

		WebElement username = driver.findElement(By.id(po.getProperty("Uname")));
		username.sendKeys("Sbhujbal");
		WebElement password = driver.findElement(By.id(po.getProperty("Pword")));
		password.sendKeys("Test@123");
		driver.findElement(By.xpath(po.getProperty("SignInbutton"))).click();
		Thread.sleep(5000);

	  
  }
  
 //Add New Audience page navigation
  @Test
  public void f1() throws InterruptedException {
	  	  
	  
	    driver.findElement(By.xpath(po.getProperty("Createaudiencebutton"))).click();
	   
		Thread.sleep(5000);
  }
  
//Add New Audience Form
  @Test
   public void f2() throws InterruptedException 
  {
	  	 
				WebElement name=driver.findElement(By.xpath("Name"));
				name.sendKeys("TestAudMarch18");
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("UsageType")).click();
	        	driver.getPageSource().contains("Mail Piece for Direct Mail: Compliant.");
	        	Thread.sleep(2000);
	            driver.findElement(By.xpath("Savebutton")).click();
	        	Thread.sleep(2000);
	        
  }
  
//Geography Selection
  @Test
  public void f3() throws InterruptedException {
	  
	    driver.findElement(By.xpath(po.getProperty("State"))).click();
		driver.findElement(By.xpath(po.getProperty("GlobalRejects"))).click();
		Thread.sleep(2000);
  }
  
//Credit Criteria Selection
  @Test
  public void f4() throws InterruptedException, IOException {
	  
	  
	    WebElement ficomin=driver.findElement(By.xpath(po.getProperty("Ficomin")));
		ficomin.sendKeys("600");
		Thread.sleep(2000);
		WebElement ficomax=driver.findElement(By.xpath(po.getProperty("Ficomax")));
		ficomax.sendKeys("650");
		driver.findElement(By.xpath(po.getProperty("Submitbutton"))).click();
		Thread.sleep(2000);
  }
  
//Create Level
  @Test
  public void f5() throws InterruptedException {
	  
	    WebElement level=driver.findElement(By.xpath(po.getProperty("LevelName")));
		level.sendKeys("Level1");
		driver.findElement(By.xpath(po.getProperty("LevelCriteria"))).click();
		Thread.sleep(2000);
		WebElement crieriaficomin=driver.findElement(By.xpath(po.getProperty("Ficomin")));
		crieriaficomin.sendKeys("600");
		Thread.sleep(2000);
		WebElement crieriaficomax=driver.findElement(By.xpath(po.getProperty("Ficomax")));
		crieriaficomax.sendKeys("650");
		driver.findElement(By.xpath(po.getProperty("Submitbutton"))).click();
		Thread.sleep(2000);
	  
	  
  }
  
//Verify Level Created
  @Test
  public void f6() {
	  
	  
		driver.findElement(By.xpath("LevelAccordion")).click();

  }
  
//Edit Level
  @Test
  public void f7() throws InterruptedException {
	  
	    driver.findElement(By.xpath(po.getProperty("EditLevel"))).click();
		Thread.sleep(2000);
		WebElement updatelevel=driver.findElement(By.xpath(po.getProperty("LevelName")));
		updatelevel.sendKeys("2");
		driver.findElement(By.xpath(po.getProperty("Submitbutton"))).click();
		Thread.sleep(2000);
  }
  
//Verify updated Level
  @Test
  public void f8(){
	  
		driver.getPageSource().contains("Level12");

  }

//Copy Level
  @Test
  public void f9() throws InterruptedException {
	  
	    driver.findElement(By.xpath(po.getProperty("CopyLevel"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(po.getProperty("Submitbutton"))).click();
		Thread.sleep(2000);
  }
  
//Verify copied Level
  @Test
  public void f10() {
	  
		driver.getPageSource().contains("copy");

  }
  
//Delete Level
  @Test
  public void f11() throws InterruptedException {
	  
	    driver.findElement(By.xpath(po.getProperty("CopiedLevel"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(po.getProperty("DeleteLevel"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(po.getProperty("Submitbutton"))).click();
		
  }
  
//Verifying deleted element
  @Test
  public void f12() {
	  
		driver.findElement(By.xpath(po.getProperty("DeletedLevel")));

  }
  
//Build Audience
  @Test
  public void f13() throws InterruptedException {
	  
	    driver.findElement(By.xpath(po.getProperty("BuildAudiencebuttons"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(po.getProperty("SelectRecords")));
		
		//need to add click save button code
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/p[contains(.,\"Your audience is being built and should be finished soon.\")]"));
		Thread.sleep(25000);
				
  }

//Select Records
  
  @Test
  public void f14() throws InterruptedException {
	  
	    driver.findElement(By.xpath(po.getProperty("SelectRecords2"))).click();
		WebElement requestedrecords=driver.findElement(By.xpath(po.getProperty("RequestedInput")));
		requestedrecords.clear();
		Thread.sleep(1000);
		requestedrecords.sendKeys("10");
		driver.findElement(By.xpath(po.getProperty("Savebutton"))).click();
		WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofHours(10));
		webdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(po.getProperty("PostNetDownStatus"))));
		Thread.sleep(1000);
		//Thread.sleep(25000);

	 	  
  }
  
//Place Order

  @Test
  public void f15() throws InterruptedException {
	  
	    driver.findElement(By.xpath(po.getProperty("SelectFile"))).click();
		Thread.sleep(1000);
		WebElement ponumber=driver.findElement(By.xpath(po.getProperty("PONumber")));
		ponumber.sendKeys("TestPO10");
		driver.findElement(By.xpath(po.getProperty("PlaceOrder"))).click();
		Thread.sleep(20000);
		WebDriverWait POdwait = new WebDriverWait(driver, Duration.ofHours(10));
		POdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(po.getProperty("AudienceSummary"))));
		Thread.sleep(5000);
 }

//Verify Placed Order

  @Test
  public void f16() throws InterruptedException {


	WebDriverWait POdwait = new WebDriverWait(driver, Duration.ofHours(10));
	POdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class=\"main-header-title\"]")));
	Thread.sleep(5000);
}

 
  
 
  @BeforeSuite
  public void beforeSuite() throws IOException {
	  
	  FileInputStream fi = new FileInputStream(
				"C:\\Users\\289634\\Selenium Document\\Advance_Automation\\IronDome\\src\\test\\resources\\Files\\Keywords.properties");
		po.load(fi);
	  
	 

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(po.getProperty("url"));
  }

  @AfterSuite
  public void afterSuite() {
	  
		driver.quit();

  }

}
