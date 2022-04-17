import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.apache.commons.io.FileUtils;

public class Misc {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.get("https://www.youtube.com/");
//		Thread.sleep(5000);
//		Actions a = new Actions(driver);
//		WebElement moveacct = driver.findElement(By.name("search_query"));
//		//a.moveToElement(moveacct).build().perform();
//		a.moveToElement(moveacct).click().sendKeys("arabic kuthu").perform();
//		List<WebElement> options = driver.findElements(By.cssSelector(".sbqs_c"));
//
//		for (WebElement option : options) {
//			System.out.println(option.getText());
//			if (option.getText().equalsIgnoreCase("arabic kuthu")) {
//				option.click();
//				break;
//			}
//		}
		driver.get("https://www.google.com/");
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\sabhi\\ss.png"));
		
		
	}

}
