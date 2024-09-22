import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) {
		
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("ignoreProtectedModeSettings", true);
	     WebDriver driver = new InternetExplorerDriver(caps);
	     driver.get("https://google.com");
	     driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Automation");
	     driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.RETURN);
	     
	     driver.close();
	     driver.quit();

	}

}
