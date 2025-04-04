package Features;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Build_Audience {

	@Test
	public void f() {

		isElementPresent("btn_BuildAudiencebuttons_xpath").click();
		Thread.sleep(1000);
		isElementPresent("msg_VerifyProcess_xpath");
		Thread.sleep(1000);
		isElementPresent("msg_AudienceBuilt_xpath");
		Thread.sleep(25000);

	}
}
