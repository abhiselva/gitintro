package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.HomePage;
import objectRepository.RediffLoginPage;	

public class testcases {
	
	@Test
	public void logintestcase()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	RediffLoginPage lp = new RediffLoginPage(driver);
	lp.username().sendKeys("Hello");
	lp.password().sendKeys("hello");
	lp.signin().click();
	lp.redifflink().click();
	
	HomePage hp = new HomePage(driver);
	hp.searchbox().sendKeys("Abhi");
	hp.searchbutton().click();
	
	}
}
