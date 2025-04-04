package Features;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Copy_Level {
	
  @Test
  public void f() {
	  
	    
	    isElementPresent("btn_CopyLevel_xpath").click();
		Thread.sleep(2000);
		isElementPresent("btn_Submitbutton_xpath").click();
		Thread.sleep(2000);
  }
}
