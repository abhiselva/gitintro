package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeLoan {
	
	
	@BeforeClass
	public void beforeclashomeloan()
	{
		System.out.println("This is from before class - HomeLoan");
	}
	
	@AfterClass
	public void afterclasshomeloan()
	{
		System.out.println("This is from after class - HomeLoan");
	}
	
	@Test
	public void webhomeloan()
	{
		System.out.println("Web Home Loan method");
	}
	
	@Test
	public void mobilehomeloan()
	{
		System.out.println("Mobile Home Loan method");
	}
	
	@Test
	public void apihomeloan()
	{
		System.out.println("API Home Loan method");
	}
}
