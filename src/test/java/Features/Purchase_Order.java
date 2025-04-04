package Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Purchase_Order {

	@Test
	public void f() {

		isElementPresent("btn_Purchasebutton_xpath").click();
		isElementPresent("msg_VerifyProcess_xpath");
		Thread.sleep(1000);
		isElementPresent("msg_VerifyProcess2_xpath");
		Thread.sleep(1000);
		Thread.sleep(300000);
	}
}
