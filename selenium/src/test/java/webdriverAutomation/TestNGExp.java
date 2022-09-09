package webdriverAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGExp {

	WebDriver driver = null;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://google.com");

	}

	@Test
	public void test1() throws InterruptedException {

		WebElement gTextBox = driver.findElement(By.name("q"));
		gTextBox.sendKeys("automation");
		Thread.sleep(3000);
	}

	@Test
	public void
    test2() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().forward();
	}
	@AfterTest
	public void endtest() {
		driver.quit();
	}
}
