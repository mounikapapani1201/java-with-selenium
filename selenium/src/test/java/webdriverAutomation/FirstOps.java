package webdriverAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class FirstOps {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		// WebDriverManager.firefoxdriver().setup();

		WebDriver cdriver = new ChromeDriver();
		cdriver.get("https://google.com");

		String Title = cdriver.getTitle();
		System.out.println(Title);
		// WebDriver fdriver = new FirefoxDriver();
		// fdriver.get("https://google.com");

		// WebDriverManager.iedriver().setup();
		// WebDriver edriver = new InternetExplorerDriver();

		// fdriver.get("https://google.com");

		Thread.sleep(3000);

		WebElement gTextBox = cdriver.findElement(By.name("q"));// by name = attribute, findelement= method
		gTextBox.sendKeys("automation");
		Thread.sleep(3000);

		WebElement gsearchBox = cdriver.findElement(By.className("gNO89b"));
		gsearchBox.click();
		Thread.sleep(3000);
		
		WebElement gsearchBox1= cdriver.findElement(By.id("content"));

		cdriver.navigate().back();

		Thread.sleep(3000);

		cdriver.navigate().forward();
		Thread.sleep(3000);

		cdriver.quit();

	}

}
