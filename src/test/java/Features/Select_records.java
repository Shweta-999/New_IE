package Features;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Select_records {

	@Test
	public void f() throws InterruptedException {

		isElementPresent("lnk_SelectRecords2_xapth").click();
		isElementPresent("ip_RequestedInput_xpath").clear();
		Thread.sleep(1000);
		isElementPresent("ip_RequestedInput_xpath").sendKeys("10");
		isElementPresent("btn_Savebutton1_xpath").click();
		WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofHours(10));
		webdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/label[contains(.,\\\"No\\\")]")));
		Thread.sleep(1000);
		// Thread.sleep(25000);

	}
}
