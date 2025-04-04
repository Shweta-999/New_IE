package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assert_implmentation extends BaseTest {

	private static final GeneralMethod generalMethod = new GeneralMethod();

	@BeforeClass
	public void setUp() throws Exception {
		// Ensure startUP() is called before any test method to load the properties
		startUP();
	}

	@Test
	public void testFunctionality() {
		WebElement visibleElementUsername = generalMethod.waitForElementToBeVisible(driver,
				By.xpath(prop.getProperty("ip_username_id")), 10);
		visibleElementUsername.sendKeys("Admin");

		WebElement visibleElementPassword = generalMethod.waitForElementToBeVisible(driver,
				By.xpath(prop.getProperty("ip_password_id")), 10);
		visibleElementPassword.sendKeys("admin123");

		WebElement signInButton = generalMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_SignInbutton_xpath")), 10);
		signInButton.click();

		WebElement LogoutddButton = generalMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_logoutdd_xpath")), 10);
		LogoutddButton.click();
		
		WebElement LogoutButton = generalMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("opt_logout_xpath")), 10);
		LogoutButton.click();
	}
	
	@Test
	public void test() {
		
		driver.close();
	}
	}
	
	
	
	

