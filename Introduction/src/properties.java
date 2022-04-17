import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class properties {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\sabhi\\Selenium IO files\\GlobalValuesInput.properties");
		prop.load(fis);
		
		String br = prop.getProperty("browser");
		System.out.println(br);
		String ur = prop.getProperty("url");
		System.out.println(ur);
		
		prop.setProperty("browser", "Firefox");
		System.out.println(prop.getProperty("browser"));
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\sabhi\\Selenium IO files\\GlobalValuesInput.properties");
		prop.store(fos, null);
	
		System.setProperty("webdriver.edge.driver","C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//maximize the window
		driver.manage().window().maximize();
		
		driver.get(ur);
		

	}

}
