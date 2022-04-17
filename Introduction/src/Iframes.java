import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(1000);
		
		// route the webdriver to go into the frames
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		
		//driver to come out of the frame
		driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("(//a[contains(@href,'i.com/autocomplete')])[2]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Autocomplete')]")).click();
	}

}
