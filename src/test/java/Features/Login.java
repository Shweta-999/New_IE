package Features;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	@Test
	public void f() throws InterruptedException, IOException {
		
		isElementPresent("ip_username_id").sendKeys("Sbhujbal");
		isElementPresent("ip_password_id").sendKeys("Test@123");
		isElementPresent("btn_SignInbutton_xpath").click();
		Thread.sleep(5000);

	}

}
