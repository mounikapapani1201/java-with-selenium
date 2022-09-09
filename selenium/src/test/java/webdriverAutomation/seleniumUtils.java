package webdriverAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class seleniumUtils extends driverUtils {

	WebDriver driver = null;

	public void click(By locators) {
		try {
			driver.findElement(locators).click();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	public void enterText(By locators, String enterString) {
		try {
			driver.findElement(locators).clear();
			driver.findElement(locators).sendKeys(enterString);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}

	}

}
