package webdriverAutomation;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener, ISuiteListener {

	public void onStart(ISuite suite) {
		
		public void onFinish(ISuite suite1) {
		}
		
		public void onTestStart(ITestResult result) {
			System.out.println("Test Started...." + result.getName());
		}
		public void onTestSuccess(ITestResult result) {
			System.out.println("Test successfully completed...." + result.getName());
		}	
		public void onTestFailure(ITestResult result) {
			System.out.println("Test failed...." + result.getName());
		}
		public void onTestSkipped(ITestResult result) {
			System.out.println("Test skipped...." + result.getName());
		}
		public void onStart(ITestContext context) {	
		}
		public void onFinish(ITestContext context) {
			System.out.println("Test completed...." + context.getName());
		}	
	}

	package listeners;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.SkipException;
	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	@Listeners(listerners.TestNGListeners.class)
	public class TestNGListernersDemo {
		@Test
		public void test1(){
			System.out.println("This is test1");
		}
		@Test
		public void test2(){
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("http://google.com");
			WebElement testBox = driver.findElement(By.name("abc"));
			testBox.sendKeys("Automation");
		}
		@Test
		public void test3(){
			System.out.println("This is test3");
			throw new SkipException("This is skipped"); //to skip a test case
		}
		@Test
		public void test4(){
			System.out.println("This is test4");
			Assert.assertTrue(false); //to fail a test casecdx1	
	}

}
