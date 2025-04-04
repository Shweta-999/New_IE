package Grouping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_logout extends BaseTest {

	private static final GeneralMethod generalMethod = new GeneralMethod();

	@BeforeClass
	public void setUp() throws Exception {
		// Ensure startUP() is called before any test method to load the properties
		startUP();
	}

	@Test(groups = {"smoke", "regression"})
	public void f1() {
		WebElement visibleElementUsername = generalMethod.waitForElementToBeVisible(driver,
				By.xpath(prop.getProperty("ip_username_id")), 10);
		visibleElementUsername.sendKeys("Admin");

		WebElement visibleElementPassword = generalMethod.waitForElementToBeVisible(driver,
				By.xpath(prop.getProperty("ip_password_id")), 10);
		visibleElementPassword.sendKeys("admin123");

		WebElement signInButton = generalMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_SignInbutton_xpath")), 10);
		signInButton.click();
	}
		@Test(groups = "functional")
		public void f2() {
		WebElement LogoutddButton = generalMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("btn_logoutdd_xpath")), 10);
		LogoutddButton.click();
		
		WebElement LogoutButton = generalMethod.waitForElementToBeClickable(driver,
				By.xpath(prop.getProperty("opt_logout_xpath")), 10);
		LogoutButton.click();
	}
	
	
}
	
	
	
	

