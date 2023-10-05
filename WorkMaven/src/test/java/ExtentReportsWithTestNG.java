import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.*;

public class ExtentReportsWithTestNG {

	ExtentSparkReporter	htmlReporter; 
	ExtentReports extentReports;
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		htmlReporter = new ExtentSparkReporter("extent.html");
		extentReports = new ExtentReports();
		extentReports.attachReporter(htmlReporter);
		driver = new FirefoxDriver();
		

	}
	@Test
	public void test1()
	{
		ExtentTest test =  extentReports.createTest("MyFirstExtentReport","Sample Description");
		test.info("Shows usage of logs");
		test.info("Test started");
		driver.get("http://firstcry.com");
		test.info("First Cry url opened");
		driver.findElement(By.xpath("//*[@id=\"mbc\"]/a")).sendKeys(Keys.RETURN);
		test.info("Clicked on cart");
		test.info("Test ended");
		test.fail("Failed");
	
	}
	
	@Test
	public void test2()
	{
		ExtentTest test =  extentReports.createTest("MyFirstExtentReport","Sample Description");
		test.info("Shows usage of logs");
		test.info("Test started");
		test.pass("Passed");
	
	}
	@AfterTest
	public void tearDown()
	
	{
		driver.quit();
		extentReports.flush();
		
	}
	

}
