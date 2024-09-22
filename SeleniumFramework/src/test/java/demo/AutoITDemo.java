package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoITDemo {
	
	public static void main(String[] args) throws Exception {
		test();

	}
	
	@SuppressWarnings("deprecation")
	public static void test() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://filetransfer.io/");
		
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/section[1]/div[5]/div[1]/p[1]/a[1]/span[1]")).click();
	
		Runtime.getRuntime().exec("Downloads /FileUploadScript.exe");
		
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
	}

}
