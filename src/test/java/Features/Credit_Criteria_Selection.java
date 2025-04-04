package Features;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Credit_Criteria_Selection {
	
  @Test
  public void f() {
	  	  
		isElementPresent("ip_Ficomin_xpath").sendKeys("600");
		Thread.sleep(2000);
		isElementPresent("ip_Ficomax_xpath").sendKeys("650");
		isElementPresent("btn_Submitbutton_xpath").click();
		Thread.sleep(2000);
  }
}
