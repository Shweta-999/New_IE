package Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_Status_of_Posted_Purchase_Order {
	

	@Test
	public void f(){
		
		//WebDriverWait OrderCompletewait = new WebDriverWait(driver, Duration.ofHours(1));
				//OrderCompletewait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li/span[contains(.,\\\"Posted\\\")]")));
		isElementPresent("msg_StatusPosted_xpath"));
				Thread.sleep(1000);
	}
}
