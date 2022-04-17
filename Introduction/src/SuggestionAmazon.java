import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggestionAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		List<String> items;
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> sugg=driver.findElements(By.cssSelector(".s-suggestion"));
		items = sugg.stream().map(s->s.getText()).collect(Collectors.toList());
		items.stream().forEach(s->System.out.println(s));
		
//		Thread.sleep(2000);
//		String sugg=driver.findElement(By.cssSelector(".s-suggestion")).getText();
//		System.out.println(sugg);
	}

}
