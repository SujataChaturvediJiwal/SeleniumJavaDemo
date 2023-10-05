import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello Google");
		
		//WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.co.in");
		

	}

}
