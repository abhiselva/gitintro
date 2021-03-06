package resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;



public class Base {
	
	public WebDriver driver;
	public Properties prop;

	public  WebDriver invokebrowsers() throws IOException
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\sabhi\\Selenium-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String browsername = System.getProperty("browser");
			
//		String browsername = prop.getProperty("browser");
		
		if (browsername.equals("chrome"))
		{
			//chrome init
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			//driver.get("https://www.google.com/");
		
		}
		else if (browsername.equals("chromeheadless"))
		{
			//chrome init
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			driver = new ChromeDriver(options);
			//driver.get("https://www.google.com/");
		
		}
		else if (browsername.equals("firefox"))
		{
			//firefox init
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browsername.equals("firefoxheadless"))
		{
			//firefox init
			FirefoxOptions foptions = new FirefoxOptions();
			foptions.addArguments("--headless");
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(foptions);
		}
		else 
		{
		System.setProperty("webdriver.edge.driver",
					"C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			//edge init
			
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver(); 
		
		}
		//Implicit wait block
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
	}
	
	public String getscreenshotPath(String testfailure, WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"\\reports\\"+testfailure+".png";
		FileUtils.copyFile(source, new File(destination));
		return destination;
	}
}
