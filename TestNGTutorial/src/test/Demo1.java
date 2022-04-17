package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo1 {
	
	@BeforeSuite
	public void beforesuitedemo()
	{
		System.out.println("Number 1 in execution");
	}
	
	@BeforeMethod
	public void beforemethoddemo()
	{
		System.out.println("before method Demo1");
	}
	
	@AfterMethod
	public void aftermethoddemo()
	{
		System.out.println("after method Demo1");
	}
	
	@Test(groups="smoke")
	public void demo()
	{
		System.out.println("First TestNG execution");
	}
	
	@Test
	public void demo1()
	{
		System.out.println("Hello Abhi");
	}

}
