package Features;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Geography_Selection {
	
  @Test
  public void f() {
	  
	  	  
		isElementPresent("opt_State_dd").click();
		isElementPresent("lnk_GlobalRejects_xpath").click();
		Thread.sleep(2000);
  }
}
