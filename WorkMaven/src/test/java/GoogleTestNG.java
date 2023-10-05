import org.testng.annotations.Test;

import config.PropertiesFile;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTestNG {

	public static WebDriver driver= null;
	public static String browserName = null;

	@BeforeTest
	public void setUpTest()
	{
		PropertiesFile.getProperties();
	   if(browserName.equalsIgnoreCase("chrome"))
	   {
		driver = new ChromeDriver();
	   }
	   else if(browserName.equalsIgnoreCase("firefox"))
	   {
		driver = new FirefoxDriver();
	   }
	}

	@Test
	public void elementClick()
	{
		// TODO Auto-generated method stub
		System.out.print("Hello FirstCry");

		//WebDriver driver = new FirefoxDriver();

		//WebDriver driver = new FirefoxDriver();

		driver.get("http://firstcry.com");

		//driver.findElement(By.id("mbc")).sendKeys(Keys.RETURN);

		driver.findElement(By.xpath("//*[@id=\"mbc\"]/a")).sendKeys(Keys.RETURN);

		// //*[@id="mbc"]/a


	}

	@AfterTest
	public void tearDownTest()
	{
		try {
		//driver.close();

		System.out.print("Hello, test completed successfully");

		driver.quit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
