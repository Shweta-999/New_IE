package Features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_copied_Level {

  @Test
  public void f() {
	  
		driver.getPageSource().contains("copy");

  }
}
