import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://google.com");
		WebElement textbox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		textbox.sendKeys("Automation Step by Step");
		List<WebElement> countOfInputs = driver.findElements(By.xpath("//input"));
		int count = countOfInputs.size();
		System.out.println("count "+ count);
		
		
		//driver.close();	
		//driver.quit();
	}
	
}
