package objectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;
	
	public RediffLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By usrname = By.xpath("//input[@id='login1']");
	By pswd = By.id("password");
	By sgnin = By.xpath("//input[@title='Sign in']");
	By redifflink = By.xpath("//a[normalize-space()='rediff.com']");
	
	public WebElement username()
	{
		return driver.findElement(usrname);
	}
	
	public WebElement password()
	{
		return driver.findElement(pswd);
	}
	
	public WebElement signin()
	{
		return driver.findElement(sgnin);
	}
	
	public WebElement redifflink()
	{
		return driver.findElement(redifflink);
	}
	
	
}
