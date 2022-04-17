package Academy;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;

import java.util.logging.*;
import java.util.logging.Logger;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;


public class ValidateBtnText extends Base{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(Base.class.getName());
	
	@BeforeTest
	public void invokeBrowser() throws IOException
	{
		driver = invokebrowsers();
		log.info("Driver is intialized");
		driver.get(prop.getProperty("url"));
		log.info("opening the URL");
	}
	
//	private static Logger getLogger(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Test
	public void allCourses() throws IOException
	{
		System.out.println(prop.getProperty("url"));
		//driver.get("http://www.qaclickacademy.com");
		LandingPage lp = new LandingPage(driver);
		lp.getnothanks().click();
		Assert.assertEquals(lp.getButtonText().getText(), "VIEW ALL COURSES");
	
		//Assert.assertTrue(lp.getNav().isDisplayed());
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}
