package Features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Actions_on_Order {

	@Test
	public void f() {

		isElementPresent("btn_Actionsbutton_xpath").click();
		Thread.sleep(1000);
		isElementPresent("btn_ShipOrderbutton_xapth").click();

		driver.switchTo().alert().accept();

		Thread.sleep(1000);

	}
}
