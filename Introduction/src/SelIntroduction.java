import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) throws InterruptedException {
		//Invoking the browsers
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.close();	
		
	}

}
