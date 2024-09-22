package test;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ExtendReportBasicDemo {
 
	private static WebDriver driver = null;
	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		ExtentTest test1 = extent.createTest("Google Search Test One","Validate search functionality");
		
		driver = new ChromeDriver();
		test1.log(Status.INFO, "Starting Test case");
		driver.get("https://google.com");
		test1.pass("Navigate to google.com");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Automation step by step");
		test1.pass("Entered text in search box");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.RETURN);
		test1.pass("Entered text");
		driver.close();
		driver.quit();
		test1.pass("Close the browser");
	
		test1.info("Completed");
		
		extent.flush();

	}

}
