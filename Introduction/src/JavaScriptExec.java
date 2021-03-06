import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class JavaScriptExec {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,750)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
		int sum = 0, total = 0, total_price = 0;
		List<WebElement> amount = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		for (int i=0;i<amount.size();i++)
		{
			sum = sum + Integer.parseInt(amount.get(i).getText());
		}
		System.out.println(sum);
		
		total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum, total);
		
		List<WebElement> price = driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		for (int i=0;i<price.size();i++)
		{
			total_price = total_price + Integer.parseInt(price.get(i).getText());
		}
		System.out.println(total_price);
	}

}
