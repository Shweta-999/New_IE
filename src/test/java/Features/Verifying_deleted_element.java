package Features;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verifying_deleted_element {
	
  @Test
  public void f() {
	  
	  	  
	  isElementPresent("vfy_DeletedLevel_xpath");

  }
}
