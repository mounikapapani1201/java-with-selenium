package webdriverAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExp2 {

	WebDriver driver = null;

	@BeforeTest
	public void setup() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
	}

	@Test
	public void test1() throws InterruptedException {

		driver.get("https://google.com");
		Thread.sleep(3000);

		WebElement gTextBox = driver.findElement(By.name("q"));
		gTextBox.sendKeys("automation");
		Thread.sleep(3000);
	}

	@Test
	public void test2() throws InterruptedException {

		driver.get("https://google.com");
		Thread.sleep(3000);
		driver.navigate().back();

		Thread.sleep(3000);

		driver.navigate().forward();
		Thread.sleep(3000);

	}

	@AfterTest
	public void endtest() {
		driver.quit();
	}
}
