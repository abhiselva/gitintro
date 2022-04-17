import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class StreamsWithSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
//		driver.findElement(By.xpath("//tr/th[1]"));
//		List<WebElement> wl = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		
//		List<String> originallist = wl.stream().map(s->s.getText()).collect(Collectors.toList());
//		
//		List<String> sortedlist = originallist.stream().sorted().collect(Collectors.toList());
		List<String> itemPrice;
//		Assert.assertTrue(originallist.equals(sortedlist));
		
		do 
		{
			List<WebElement> items = driver.findElements(By.xpath("//tbody/tr/td[1]"));
			itemPrice = items.stream().filter(s->s.getText().contains("Cherry")).map(s->getvegPrice(s)).collect(Collectors.toList());
			//System.out.println();
			if (itemPrice.size()<1)
			{
				driver.findElement(By.cssSelector("a[aria-label=\"Next\"]")).click();
			}
							
		}while(itemPrice.size()<1);
		itemPrice.forEach(s->System.out.println(s));
	}

	private static String getvegPrice(WebElement a) {
		// TODO Auto-generated method stub
		String price = a.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
