package Features;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Place_order {

	@Test
	public void f(){
		
		
		isElementPresent("lnk_SelectFile_path").click();
		Thread.sleep(1000);
		isElementPresent("ip_PONumber_xapth").sendKeys("TestPO10");
		isElementPresent("btn_PlaceOrder_xapth").click();
		isElementPresent("msg_VerifyProcess_xpath");
		Thread.sleep(1000);
		isElementPresent("msg_VerifyProcess2_xpath");
		Thread.sleep(20000);


	}
}
