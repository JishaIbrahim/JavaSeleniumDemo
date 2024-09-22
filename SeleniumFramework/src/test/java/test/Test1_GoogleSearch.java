package test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test1_GoogleSearch {
	public static void main(String[] args) {
		googlesearch();
	}
	public static void googlesearch() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Automation step by step");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.RETURN);
		//driver.close();
		System.out.println("Test Completed");
		
	}

}
