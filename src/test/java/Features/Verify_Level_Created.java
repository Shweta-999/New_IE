package Features;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_Level_Created {
	
  @Test
  public void f() throws IOException {
	  
	   
	  
	  isElementPresent("lkn_LevelAccordion_xpath").click();

  }
}
