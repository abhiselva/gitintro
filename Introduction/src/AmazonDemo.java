import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Lenovo Laptops");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> items = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		for(int i=1;i<=10;i++)
//		{
//			js.executeScript("window.scrollBy(0,2000)");
//			Thread.sleep(1000);
//			i++;
//		}
		List<String> needed = items.stream().distinct().filter(s->s.getText().contains("IdeaPad Slim 3")).filter(s->s.getText().contains("15.6"))
				.map(s->s.getText()).collect(Collectors.toList());
		
		needed.forEach(s->System.out.println(s));
	}

}
