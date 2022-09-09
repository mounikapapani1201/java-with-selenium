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

public class DemoLoginPage {

	WebDriver driver = null;

	@BeforeTest
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
	
		
		@Test
		public void test1() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Username = driver.findElement(By.name("username"));
		WebElement Password = driver.findElement(By.name("password"));
		WebElement Loginbutton = driver.findElement(By.tagName("button"));

		Username.sendKeys("admin");
		Password.sendKeys("admin123");
		Loginbutton.click();

		String actualURL = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
		String expectedURL = driver.getCurrentUrl();
		System.out.println(expectedURL);
		Assert.assertEquals(actualURL, expectedURL);
	}
		

	@AfterTest
	public void Exit() {
		driver.close();
		driver.quit();
	}
}
