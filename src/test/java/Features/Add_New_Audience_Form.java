package Features;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Add_New_Audience_Form {

	@Test
	public void f() {
		
		isElementPresent("ip_Name_xpath").sendKeys("TestAudMarch18");
		Thread.sleep(2000);
		isElementPresent("lnk_UsageType_xpath").click();
		driver.getPageSource().contains("Mail Piece for Direct Mail: Compliant.");
		Thread.sleep(2000);
		isElementPresent("btn_Savebutton_xpath").click();
		Thread.sleep(2000);

	}
}
