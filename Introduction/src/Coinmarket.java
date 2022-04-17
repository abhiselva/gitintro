import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// tried to pull all the 100 coins from the website, but unable to fetch all only 20 is fetched
public class Coinmarket {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://coinmarketcap.com/");
		
		//Thread.sleep(2000);
		//WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		Thread.sleep(3000);
		//List<WebElement> coins = driver.findElements(By.xpath("//p[@class='sc-1eb5slv-0 iworPT']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=1;i<=10;i++)
		{
			js.executeScript("window.scrollBy(0,2000)");
			Thread.sleep(1000);
			i++;
		}
		
		//js.executeScript("window.scrollBy(0,5000)");
		
		//w.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@class='sc-16r8icm-0 sc-1teo54s-1 dNOTPP']/p"), 20));
		List<WebElement> coins = driver.findElements(By.xpath("//td/div/a/div/div/p"));
		//find and print all the 100 coins in the page
		//System.out.println(coins.size());
		//coins.stream().map(s->s.getText()).forEach(s->System.out.println(s));
		
		
		//find the coins who value is appreciated or depreciated in 24h
		List<WebElement> up = driver.findElements(By.xpath("//td[5]/span/span[@class='icon-Caret-up']/ancestor::tr//td/div/a/div/div/p"));
		List<WebElement> down = driver.findElements(By.xpath("//td[5]/span/span[@class='icon-Caret-down']/ancestor::tr//td/div/a/div/div/p"));
		System.out.println(down.size());
		down.stream().map(s->s.getText()).forEach(s->System.out.println(s));
		
		
	}
	

}
