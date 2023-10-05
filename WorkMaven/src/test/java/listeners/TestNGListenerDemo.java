package listeners;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(listeners.TestNGListener.class)

public class TestNGListenerDemo {

	@Test
	public void test1()
	{
		System.out.println("Inside test 1");
	}
	@Test
	@AfterTest
	public void test2()
	{
		System.out.println("Inside test 2");
	}
	@Test
	public void test3()
	{
		System.out.println("Inside test 3");
	}
}
