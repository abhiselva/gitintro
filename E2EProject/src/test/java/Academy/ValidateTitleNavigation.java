package Academy;

import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;


public class ValidateTitleNavigation extends Base{
	public WebDriver driver;
	public static Logger log = Logger.getLogger(Base.class.getName());
	LandingPage lp;
	@BeforeTest
	public void invokeBrowser() throws IOException
	{
		driver = invokebrowsers();
		log.info("Driver is intialized");
		driver.get(prop.getProperty("url"));
		log.info("opening the URL");
	}
	
	@Test
	public void featuredCourses() throws IOException, InterruptedException
	{
		
		lp = new LandingPage(driver);
		lp.getnothanks().click();
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES");
		Assert.assertTrue(lp.getNav().isDisplayed());
		log.info("Heading displayed");
	}
	
	@Test(dependsOnMethods = {"featuredCourses"} )
	public void basePageHeader() throws IOException, InterruptedException
	{
		Assert.assertEquals(lp.getHeader().getText(), "Learn Hot tools like Selenium, Appium, JMeter, SoapUI,Database Testing and more..");
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}
		