package webdriverAutomation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PomTest extends driverUtils {

	pages login;

	void test() {
		login = new pages();
	}

	@BeforeTest
	public void openBrowser() throws InterruptedException {
		setup();
	}

	@Test
	public void testcase() {

		login.enterEmail();
		login.enterPassword();

	}

	@AfterTest
	public void tearDown() {
		endTest();
	}

}
