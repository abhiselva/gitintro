import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Greenkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		String[] vegies = { "Cucumber", "Banana", "Strawberry" };
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		Thread.sleep(4000);
		List<String> vegieslist = Arrays.asList(vegies);
		int j=0;
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			if (vegieslist.contains(name[0].trim())) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == vegies.length)
					break;
			}
		}
	}

}
