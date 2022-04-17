import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.apache.commons.io.FileUtils;

public class SelFourNewWindow {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//open a new window and grab a text fro there and put in the current window
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> whandles = driver.getWindowHandles();
		Iterator<String> it = whandles.iterator();
		String parentwin = it.next();
		String childwin = it.next();
		driver.switchTo().window(childwin);
		driver.get("https://rahulshettyacademy.com/");
		String fcourse = driver.findElement(By.xpath("(//h2/a)[1]")).getText();
		
		driver.switchTo().window(parentwin);
		WebElement nameinp = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		nameinp.sendKeys(fcourse);
		//taking a partial screenshot - particular web element
//		File file = nameinp.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file,new File("C:\\Users\\sabhi\\ss1.png"));
//		
		//tried full page screenshot - but getting only cropped not scrolling window.
//		WebElement fp = driver.findElement(By.xpath("//html"));
//		
//		File file1 = fp.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file1,new File("C:\\Users\\sabhi\\Fullpage1.png"));
		
		System.out.println(nameinp.getRect().getDimension().getHeight());
		System.out.println(nameinp.getRect().getWidth());
		
		
		

	}

}
