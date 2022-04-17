import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerthandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/	");
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Ragu");
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Ragu");
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}

}
