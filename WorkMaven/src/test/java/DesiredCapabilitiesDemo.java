import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new InternetExplorerDriver();
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(null, caps);
		driver.get("https://google.co.in");
		driver.findElement(By.id("input")).sendKeys("ABCD");
		driver.findElement(By.id("input")).sendKeys(Keys.RETURN);
		
		driver.close();
		driver.quit();
	}

}
