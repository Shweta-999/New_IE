package Prerequisites;

import org.testng.annotations.BeforeSuite;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class url {

	WebDriver driver = new ChromeDriver();

	@BeforeSuite
	public void beforeSuite() throws IOException {

		FileInputStream fi = new FileInputStream(
				"C:\\Users\\289634\\Selenium Document\\Advance_Automation\\IronDome\\src\\test\\resources\\Files\\Keywords.properties");

		Properties po = new Properties();
		po.load(fi);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(po.getProperty("url"));
	}

	@AfterSuite
	public void afterSuite() {

		driver.quit();
	}

}
