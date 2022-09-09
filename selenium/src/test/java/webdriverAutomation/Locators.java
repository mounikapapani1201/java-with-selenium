package webdriverAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");

		// WebElement
		// Searchbox=driver.findElement(By.xpath("/html/body/ntp-app//div/ntp-realbox//div/input"));
		WebElement Searchbox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		Searchbox.click();

		Thread.sleep(3000);
	}

}
