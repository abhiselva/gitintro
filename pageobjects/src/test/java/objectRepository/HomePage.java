package objectRepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//By srchbox = By.xpath("//input[@id='srchquery_tbox']");
	//By srchbtn = By.xpath("(//input[@type='submit'])[2]");
	
	@FindBy(xpath="//input[@id='srchquery_tbox']")
	WebElement srchbox;
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement srchbtn;
	
	
	public WebElement searchbox()
	{
		return srchbox;
	}
	
	public WebElement searchbutton()
	{
		return srchbtn;
	}
	
}
