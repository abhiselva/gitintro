import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.className("blinkingText")).click();
		//working with mulltiple windows
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		
		driver.switchTo().window(childid);
		Thread.sleep(500);
		System.out.println(driver.findElement(By.cssSelector("a[href*='@']")).getText());	
		String email = driver.findElement(By.cssSelector("a[href*='@']")).getText();
		
		driver.switchTo().window(parentid);
		driver.findElement(By.id("username")).sendKeys(email);
		
	}

}
