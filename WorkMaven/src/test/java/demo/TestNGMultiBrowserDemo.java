package demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {

	WebDriver driver = null;
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName)
	{
		System.out.println("Browser Name is:"+browserName);
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			System.out.println("Thread id:"+Thread.currentThread().getId());
		}
		else
			driver = new FirefoxDriver();
			System.out.println("Thread id:"+Thread.currentThread().getId());
	}
	
	@Test
	public void test1() throws InterruptedException
	{
	driver.get("https://google.com");
	Thread.sleep(4000);
	}
	

	@AfterTest
	public void tearDown()
	{
		driver.close();
		System.out.println("************Test completed************");
	}
}
