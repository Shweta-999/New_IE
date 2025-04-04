package Features;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Create_Level {
	

  @Test
  public void f() throws InterruptedException, IOException {
	  
	  
		isElementPresent("ip_LevelName_xpath").sendKeys("Level1");
		isElementPresent("lnk_LevelCriteria_xpath").click();
		Thread.sleep(2000);
		isElementPresent("ip_Ficomin_xpath").sendKeys("600");
		Thread.sleep(2000);
		isElementPresent("ip_Ficomax_xpath").sendKeys("650");
		isElementPresent("btn_Submitbutton_xpath").click();
		Thread.sleep(2000);
	  
	  
  }
}
