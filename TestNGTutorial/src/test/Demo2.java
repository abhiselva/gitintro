package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo2 {
	
	@Test(dataProvider = "getData")
	public void demo(String user, String password)
	{
		System.out.println("Second TestNG execution");
		System.out.println(user +" & "+ password);
		
	}
	
	@AfterSuite 
	public void aftersuitedemo()
	{
		System.out.println("Last in execution");
	}
		
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "user1";
		data[0][1] = "pswd1";
		data[1][0] = "user2";
		data[1][1] = "pswd2";
		return data;
	}
}
