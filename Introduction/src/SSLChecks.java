import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLChecks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeOptions option = new EdgeOptions();
		option.setAcceptInsecureCerts(true);
		
//		ChromeOptions option1 = new ChromeOptions();
//		option1.setAcceptInsecureCerts(true);
//		
//		FirefoxOptions option2 = new FirefoxOptions();
//		option2.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(option);
		
		driver.get("https://expired.badssl.com");
	}

}
