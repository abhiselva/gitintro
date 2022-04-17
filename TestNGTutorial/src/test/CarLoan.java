package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoan {
	
@Parameters({"URL"})
	@BeforeTest
	public void beforetestcarloan(String URL)
	{
		System.out.println("This is from before test - CarLoan");
		System.out.println(URL);
	}
	
	@AfterTest
	public void aftertestcarloan()
	{
		System.out.println("This is from after test - CarLoan");
	}
	
	@Test
	public void webcarloan()
	{
		int i=0;
		i = 9/0;
		System.out.println("Web Car Loan method :" + i);
		
		
	}
	
	@Test
	public void mobilecarloan()
	{
		System.out.println("Mobile Car Loan method");
	}
	
	@Test
	public void apicarloan()
	{
		System.out.println("API Car Loan method");
	}
}
