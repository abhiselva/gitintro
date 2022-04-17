import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greekartwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.edge.driver",
						"C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
				WebDriver driver = new EdgeDriver();
				String[] vegies = { "Cucumber", "Banana", "Strawberry" };
				//explicit wait class
				WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
				
				//implicit wait is done globally
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://rahulshettyacademy.com/seleniumPractise/");
				addItem(driver,vegies);
				driver.findElement(By.cssSelector("img[alt='Cart']")).click();
				//Thread.sleep(500);
				
				driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
				//Explicit wait
				w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
				
				driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
				driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
				//Explicit wait for specific element
				w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
				
				
				System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}
	
	public static void addItem(WebDriver driver,String[] vegies) throws InterruptedException {
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
