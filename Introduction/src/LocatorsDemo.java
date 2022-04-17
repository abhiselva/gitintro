import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.edge.driver","C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
		
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passtext = driver.findElement(By.cssSelector("form p")).getText();
		String[] pass = passtext.split("'");
		String[] password = pass[1].split("'");
		
		System.out.println(password[0]);
		
		driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys(password[0]);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("p")).getText());
		//driver.close();
	}

}
