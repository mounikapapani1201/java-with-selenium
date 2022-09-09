package webdriverAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotPrac {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
        takeSnapShot(driver,"C://Users//papan//eclipse-workspace//selenium//Screenshot.png");
	}

	private static void takeSnapShot(WebDriver driver, String filepath) throws IOException {
		TakesScreenshot shot = ((TakesScreenshot) driver);
		File srcFile = shot.getScreenshotAs(OutputType.FILE);
		File desFile = new File("filepath");
		FileUtils.copyFile(srcFile, desFile);
		
	}

}
