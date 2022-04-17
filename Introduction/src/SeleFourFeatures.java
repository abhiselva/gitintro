import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class SeleFourFeatures {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//above() in selenium
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nametextbox = driver.findElement(By.name("name"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nametextbox)).getText());
		//dob text box is a flex component which is is not pulled with the new functions
		//below() in selenium
		WebElement doblabel = driver.findElement(By.cssSelector("label[for='dateofBirth']"));
		System.out.println(driver.findElement(with(By.tagName("input")).below(doblabel)).getAttribute("value"));
		
		//toLeftOf()
		WebElement checktext = driver.findElement(By.cssSelector("label[for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(checktext)).click();
		
		Thread.sleep(1000);
		//toRightOf()
		WebElement fradio = driver.findElement(By.cssSelector("input[value='option1']"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(fradio)).getText());
		
		driver.findElement(with(By.)
	}

}
