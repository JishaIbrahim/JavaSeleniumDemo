package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReports_TestNG {
    
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent; 
	WebDriver driver;
	@BeforeSuite
	public void setUp() {
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
        
	}
	
	@BeforeTest
    public void setUpTest() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void test1() throws Exception {
		
		ExtentTest test = extent.createTest("Google Search Test One","Validate search functionality");
		driver.get("https://google.com");
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		test.info("Usage of info(details)");
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed");
	}
	
	@AfterSuite
	public void tearDown() {
		extent.flush();
	}
}
