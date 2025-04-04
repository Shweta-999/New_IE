package Multiple_suite_execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;

public class OrganizationTest extends BaseTest {

    private static final GeneralMethod generalMethod = new GeneralMethod();

    @Test
    public void handleOrganizationDropdown() {
        // Wait for the Organization dropdown to be clickable and click it
        WebElement organizationDropdown = generalMethod.waitForElementToBeClickable(driver,
                By.xpath(prop.getProperty("dropdown_xpath")), 10);
        organizationDropdown.click();

        // Wait for the "Location" option to be clickable and click it
        WebElement locationOption = generalMethod.waitForElementToBeClickable(driver,
                By.xpath(prop.getProperty("location_option_xpath")), 10);
        locationOption.click();
        System.out.println("Location option selected.");

        // Fill in Name and City fields with random values and click Search
        // Wait for the Name field to be visible and send a random name
        WebElement nameField = generalMethod.waitForElementToBeVisible(driver,
                By.xpath(prop.getProperty("input_name_xpath")), 10);
        nameField.sendKeys(generateRandomName());
        System.out.println("Random Name entered: " + nameField.getAttribute("value"));

        // Wait for the City field to be visible and send a random city
        WebElement cityField = generalMethod.waitForElementToBeVisible(driver,
                By.xpath(prop.getProperty("input_city_xpath")), 10);
        cityField.sendKeys(generateRandomCity());
        System.out.println("Random City entered: " + cityField.getAttribute("value"));

        // Wait for the Search button to be clickable and click it
        WebElement searchButton = generalMethod.waitForElementToBeClickable(driver,
                By.xpath(prop.getProperty("search_button_xpath")), 10);
        searchButton.click();
        System.out.println("Search button clicked.");

        // If "General Information" is selected
        WebElement generalInfoOption = generalMethod.waitForElementToBeClickable(driver,
                By.xpath(prop.getProperty("general_information_option_xpath")), 10);
        generalInfoOption.click();
        System.out.println("General Information option selected.");

        // Wait for the Edit button to be clickable and click it
        WebElement editButton = generalMethod.waitForElementToBeClickable(driver,
                By.xpath(prop.getProperty("edit_button_xpath")), 10);
        editButton.click();
        System.out.println("Edit button clicked.");

        // Wait for the Save button to be clickable and click it
        WebElement saveButton = generalMethod.waitForElementToBeClickable(driver,
                By.xpath(prop.getProperty("save_button_xpath")), 10);
        saveButton.click();
        System.out.println("Save button clicked.");
    }

    // Helper method to generate a random name
    private String generateRandomName() {
        String[] names = {"John", "Jane", "Alice", "Bob", "Eve", "Charlie"};
        Random random = new Random();
        return names[random.nextInt(names.length)] + "_" + random.nextInt(1000);
    }

    // Helper method to generate a random city name
    private String generateRandomCity() {
        String[] cities = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix"};
        Random random = new Random();
        return cities[random.nextInt(cities.length)];
    }
}
