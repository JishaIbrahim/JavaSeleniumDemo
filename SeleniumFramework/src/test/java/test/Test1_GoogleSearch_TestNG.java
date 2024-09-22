package test;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Test1_GoogleSearch_TestNG {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		 driver = new ChromeDriver();
	}
	
	@Test
	public void googlesearch() throws Exception{
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password");
		
//		driver.get("https://google.com");
//		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Automation step by step");
//		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.RETURN);
	}
    
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed");
	}
}
