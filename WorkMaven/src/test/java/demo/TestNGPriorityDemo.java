package demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {

	

	@Test(priority = 2)
	public void one()
	{
		System.out.println("*****Inside test 1");
	}
	@Test(priority = 2)
	public void two()
	{
		System.out.println("*****Inside test 2");
	}
	@Test(priority = 2)
	public void three()
	{
		System.out.println("*****Inside test 3");
	}
}
