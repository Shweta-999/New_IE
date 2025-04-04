package Multiple_suite_execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Time_btn extends BaseTest {
	
    private static final GeneralMethod generalMethod = new GeneralMethod();

  @Test
  public void f() {
	  
	  WebElement ElementTimeButton = generalMethod.waitForElementToBeClickable(driver,
              By.xpath(prop.getProperty("btn_time_xpath")), 10);
      ElementTimeButton.click();
      
      WebElement visibleElementename = generalMethod.waitForElementToBeVisible(driver,
				By.xpath(prop.getProperty("ip_empname_xpath")), 10);
		visibleElementename.sendKeys("Pratik Raj Parajuli");
		
		 WebElement ElementViewButton = generalMethod.waitForElementToBeClickable(driver,
	              By.xpath(prop.getProperty("btn_view_xpath")), 10);
	      ElementViewButton.click();
  }
  
  
  }
