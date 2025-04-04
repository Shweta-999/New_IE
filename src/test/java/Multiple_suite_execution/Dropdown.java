package Multiple_suite_execution;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Dropdown extends BaseTest {

    private static final GeneralMethod generalMethod = new GeneralMethod();

    @Test(groups = "smoke")
    public void f() {
        // Wait for the Admin button to be clickable and click it
        WebElement ElementAdminButton = generalMethod.waitForElementToBeClickable(driver,
                By.xpath(prop.getProperty("btn_AdminButton_xpath")), 10);
        ElementAdminButton.click();

        // Wait for the dropdown element to be clickable and open it
        WebElement dropdown = generalMethod.waitForElementToBeClickable(driver,
                By.xpath(prop.getProperty("dd_option_xpath")), 10);
        dropdown.click();
        System.out.println("Dropdown is clickable, opening...");

        // Wait for the dropdown options to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        List<WebElement> dropdownOptions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@class, 'oxd-select-option')]")));
        
        if (dropdownOptions.size() > 0) {
            System.out.println("Dropdown options are visible.");
        } else {
            System.out.println("No dropdown options found.");
        }

        // Wait for the "Admin" option to be clickable and visible
        WebElement adminOption = generalMethod.waitForElementToBeClickable(driver,
                By.xpath("//div[contains(text(),'Admin')]"), 10);
        System.out.println("Waiting for the 'Admin' option to be clickable...");

        // Additional check: Make sure the admin option is not covered by other elements
        if (adminOption.isDisplayed() && adminOption.isEnabled()) {
            try {
                // Use Actions class to perform the click
                Actions actions = new Actions(driver);
                actions.moveToElement(adminOption).click().perform();  // Hover and click the "Admin" option
                System.out.println("Selected 'Admin' option.");
            } catch (Exception e) {
                System.out.println("Error performing action on 'Admin' option: " + e.getMessage());
                // Optional: Use JavaScriptExecutor if the Actions approach fails
                clickUsingJavaScript(adminOption);
            }
        } else {
            System.out.println("The 'Admin' option is not clickable or visible.");
        }
    }

    // Helper method to click an element using JavaScriptExecutor if the normal click fails
    private void clickUsingJavaScript(WebElement element) {
        try {
            System.out.println("Attempting to click using JavaScript...");
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        } catch (Exception e) {
            System.out.println("JavaScript click also failed: " + e.getMessage());
        }
    }
    
    }
