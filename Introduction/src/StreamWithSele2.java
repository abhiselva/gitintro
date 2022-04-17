import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class StreamWithSele2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("erry");
		List<String> items;
		
		List<WebElement> dispitems = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		items = dispitems.stream().map(s->s.getText()).collect(Collectors.toList());
		//System.out.println();
		items.stream().map(s->s.contains("erry")).forEach(s->System.out.println(s));
		


	}

}
