package webdriverAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		// Abouslute xpath
		//driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[2]/form/input[4]"))
				//.sendKeys("T-shirts");
		// relative xpath
		//driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
		
		// xpath with 'or' operator
		
		driver.findElement(By.xpath("//input[@id='search_query_top' or @name=search_query]")).sendKeys("T-shirts");
		
		

	}

}
