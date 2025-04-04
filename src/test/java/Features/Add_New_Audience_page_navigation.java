package Features;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Add_New_Audience_page_navigation {

	@Test
	public void f() {

		isElementPresent("btn_Createaudiencebutton_xpath").click();

		Thread.sleep(5000);

	}

}
