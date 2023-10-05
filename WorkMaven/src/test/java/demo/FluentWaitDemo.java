package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;                                                                                                                                                                                                                                                                                                                                                                              
public class FluentWaitDemo {
	
	public static void main(String args[])
	{
		test();
	}
	
	public static void test()
	{
	
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://google.com");
		webDriver.findElement(By.name("q")).sendKeys("ABCD");
		webDriver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		webDriver.findElement(By.linkText("https://www.amazon.in/ABCD-Toys-Games/s?k=ABCD&rh=n%3A1350380031")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("clicked searcjh");
	}

}
