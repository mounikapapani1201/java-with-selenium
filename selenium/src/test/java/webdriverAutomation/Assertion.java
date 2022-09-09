package webdriverAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {
     @Test
	public void loginTest() {

	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		WebElement Username = driver.findElement(By.name("email"));
		WebElement Password = driver.findElement(By.name("pass"));
		WebElement Loginbutton = driver.findElement(By.name("login"));

		Username.sendKeys("papanimounika12@gmail");
		Password.sendKeys("admin123");
		Loginbutton.click();
		String actual_error = driver.findElement(By.className("_9ay7")).getText();
		String expected_error = "The password you’ve entered is incorrect";

		Assert.assertEquals(actual_error, expected_error);

	}
}
