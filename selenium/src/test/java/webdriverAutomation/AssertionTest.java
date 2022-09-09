package webdriverAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionTest {

	WebDriver driver = null;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}

	@Test
	public void loginTest() {

		
		WebElement Username = driver.findElement(By.id("email"));
		WebElement Password = driver.findElement(By.id("pass"));
		WebElement Loginbutton = driver.findElement(By.name("login"));

		Username.sendKeys("papanideepika17@gmail.com");
		Password.sendKeys("admin123");
		Loginbutton.click();

		String actual_error = driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[1]/div[2]")).getText();
		String expected_error = "The password you’ve entered is incorrect. Forgot Password?";

		Assert.assertEquals(actual_error, expected_error);

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}

	{

	}
}
