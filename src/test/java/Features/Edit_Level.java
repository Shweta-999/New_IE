package Features;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Edit_Level {
	
  @Test
  public void f(){
	  	    
		isElementPresent("btn_EditLevel_xpath").click();
		Thread.sleep(2000);
		isElementPresent("ip_LevelName_xpath").sendKeys("2");
		isElementPresent("btn_Submitbutton_xpath").click();
		Thread.sleep(2000);
  }
}
