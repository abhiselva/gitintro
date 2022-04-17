import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScopeWebPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		//maximize the window
		//driver.manage().window().maximize();
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		//limiting webdriver scope
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement columndriver = footerdriver.findElement(By.xpath("//tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clicknewtab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clicknewtab);
		
			Thread.sleep(5000);
		}
		Set<String> win=driver.getWindowHandles();
		Iterator<String> it=win.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
	}

}
