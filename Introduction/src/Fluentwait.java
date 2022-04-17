import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fluent wait dont have predefined mthods as WebElement wait class, we need to write customized methods.
		//this is little complex for coding
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//div[@id='start']/button")).click();
		
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		 WebElement foo = w.until(new Function<WebDriver, WebElement>() 
		 {
		     public WebElement apply(WebDriver driver) {
		     if (driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed())
		     {
		       return driver.findElement(By.cssSelector("div[id='finish'] h4"));
		     }
		     else
		    	 return null;
		 }
		 });
		System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).getText());
	}

}
