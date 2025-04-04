package Features;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Verify_Placed_Order {
	

	@Test
	public void f() {

		WebDriverWait POdwait = new WebDriverWait(driver, Duration.ofHours(10));
		POdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(po.getProperty("msg_VerifyHeader_xpath"))));
		Thread.sleep(5000);

	}
}
