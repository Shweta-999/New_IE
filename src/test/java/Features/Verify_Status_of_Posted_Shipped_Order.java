package Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_Status_of_Posted_Shipped_Order {

	@Test
	public void f() {
		isElementPresent("msg_OrderStatus_xapth");
		Thread.sleep(1000);
		isElementPresent("cnt_OrderCount_xapth");
		Thread.sleep(1000);

	}
}
