package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {
	
	public static void main(String[] args) {
		test();
	}

public static void test()
{
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
	options.addArguments("window-size=1280,800");
	
	WebDriver driver = new ChromeDriver(options);
	
	driver.get("https://google.com");
	System.out.println("Title name:"+driver.getTitle());
	driver.findElement(By.name("q")).sendKeys("Automation");
	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	
	driver.close();
	driver.quit();
	
}

}


