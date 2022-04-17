import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		//moves or mouseover
		WebElement moveacct = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		a.moveToElement(moveacct).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//span[text()='Your Account']"))).keyDown(Keys.CONTROL).click().build().perform();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.cssSelector(".a-color-secondary")).getText());
		List<WebElement> texts = driver.findElements(By.cssSelector(".a-color-secondary"));
		int i = 0;
		for (WebElement text : texts)
		{
			System.out.println(driver.findElements(By.cssSelector(".a-color-secondary")).get(i).getText());
			i++;
			}
		
		//enter text in caps and select
//		WebElement textselect = driver.findElement(By.id("twotabsearchtextbox"));
//		a.moveToElement(textselect).click().keyDown(Keys.SHIFT).sendKeys("laptop").doubleClick().build().perform();
	
	}

}
