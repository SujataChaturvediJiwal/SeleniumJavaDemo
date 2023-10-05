package demo;

import org.testng.annotations.Test;

public class TestNGDependenciesDemo {
	
	@Test(dependsOnGroups = {"Sanity.*"} )
	public void test1()
	{
		System.out.println("I m inside tes 1");
	}
	
	@Test()
	public void test2()
	{
		System.out.println("I m inside tes 2");
	}
	
	@Test(groups = {"Sanity0"})
	public void test3()
	{
		System.out.println("I m inside tes 3");
	}
	
	@Test()
	public void test4()
	{
		System.out.println("I m inside tes 4");
	}

}
