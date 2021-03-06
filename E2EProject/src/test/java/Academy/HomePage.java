package Academy;
import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;


public class HomePage extends Base{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(Base.class.getName());
	@BeforeTest
	public void invokeBrowser() throws IOException
	{
		driver = invokebrowsers();
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		//lp.getnothanks().click();
		lp.getnothanks().click();
		lp.getLogin().click();
		log.info("Clicked Login");
	}
	
	@Test(dataProvider = "getData")
	public void basePageNavigation(String username, String password) throws IOException, InterruptedException
	{

		//driver.get("http://www.qaclickacademy.com");
//		LandingPage lp = new LandingPage(driver);
//		//lp.getnothanks().click();
//		lp.getLogin().click();
		Thread.sleep(1000);
		LoginPage ll = new LoginPage(driver);
		ll.getEmail().sendKeys(username);
		ll.getPassword().sendKeys(password);
		ll.getLogin().click();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="email1@email.com";
		data[0][1]="password1";
		
		data[1][0]="email2@email.com";
		data[1][1]="password2";
				
		return data;
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
	
//	@Test
//	public void LoginPageNavigation() throws IOException
//	{
////		driver = invokebrowsers();
////		driver.get("http://www.qaclickacademy.com/");
////		LandingPage lp = new LandingPage(driver);
////		lp.getLogin().click();
//		LoginPage ll = new LoginPage(driver);
//		ll.getEmail().sendKeys("a@a.com");
//		ll.getPassword().sendKeys("123");
//		ll.getLogin().click();
//		System.out.println("login block");
//	
//	}
}
