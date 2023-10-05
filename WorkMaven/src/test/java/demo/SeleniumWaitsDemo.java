package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWaitsDemo {
	
	public static void main(String[] args) {
	
	seleniumWaits();
	
	}
	
	@SuppressWarnings("deprecation")
	public static void seleniumWaits()
	{
		WebDriver webDriver = new ChromeDriver(); 
		
		webDriver.get("https://google.com");
		
		//webDriver.findElement(By.id("input")).sendKeys("Automation step by step");
		//webDriver.findElement(By.id("icon")).sendKeys(Keys.RETURN);
		
		webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		webDriver.findElement(By.name("q")).sendKeys("Automation step by step");
		//webDriver.findElement(By.xpath("//input[@id=\"input\"]")).sendKeys("Automation step by step");
		
		webDriver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		System.out.println("clicked searcjh");
		
		//webDriver.get("http://firstcry.com");
		//webDriver.findElement(By.xpath("//*[@id=\"mbc\"]/a")).sendKeys(Keys.RETURN);
		//webDriver.findElement(By.id("input")).sendKeys("Automation step by step");
		
		
		webDriver.close();
		webDriver.quit();
	}
	
}
