package test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googlesearch();
	}
	public static void googlesearch() {
		driver = new ChromeDriver();
		driver.get("https://google.com");
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		//driver.close();
		System.out.println("Test Completed");
		
	}

}
