package webdriverAutomation;

import org.openqa.selenium.By;

public class pages extends seleniumUtils {

	By email = By.id("email");
	By password = By.id("password");

	public void enterEmail() {
		click(email);
		enterText(email, "diana@example.com");

	}

	public void enterPassword() {
		click(password);
		enterText(password, "pass1234");
	}
}
