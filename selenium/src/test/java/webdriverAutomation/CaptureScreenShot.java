package webdriverAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		/*
		 * TakesScreenshot ts = (TakesScreenshot)driver;
		 * 
		 * File src = ts.getScreenshotAs(OutputType.FILE); File trg= new
		 * File(".\\Screenshot\\homepage.png");
		 * 
		 * 
		 * FileUtils.copyFile(src, trg);
		 */
		
		
		// screenshot of portion
		

		/*
		 * WebElement section = driver.findElement(By.xpath(
		 * "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[4]")); File src =
		 * section.getScreenshotAs(OutputType.FILE); File trg= new
		 * File(".\\Screenshot\\features.png"); FileUtils.copyFile(src, trg);
		 */
		
		
		//screenshot of element
		
		WebElement section = driver.findElement(By.xpath("//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]"));
		File src = section.getScreenshotAs(OutputType.FILE);
		File trg= new File(".\\Screenshot\\logo.png");
		FileUtils.copyFile(src, trg);
		
		
		driver.close();
		
		
		
		
	}

}
