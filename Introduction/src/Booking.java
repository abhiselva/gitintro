import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Booking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		/*
		 * driver.get("https://www.spicejet.com/"); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//div[text()='round trip']")).click();
		 * driver.findElement(By.xpath("(//input[@autocapitalize=\"sentences\"])[1]")).
		 * sendKeys("BLR"); Thread.sleep(1000);
		 * driver.findElement(By.xpath("(//input[@autocapitalize=\"sentences\"])[2]")).
		 * sendKeys("MAA"); driver.findElement(By.xpath(
		 * "(//div[@data-testid='undefined-calendar-day-25'])[1]")).click();
		 * Thread.sleep(1000); driver.findElement(By.xpath(
		 * "(//div[@data-testid='undefined-calendar-day-25'])[2]")).click();
		 * Thread.sleep(2000); System.out.println(driver.findElement(By.
		 * xpath("//div[text()='Search Flight']")).getText());
		 * driver.findElement(By.xpath("//div[text()='Search Flight']")).click();
		 * driver.findElement(By.xpath("//div[text()='Search Flight']")).click();
		 */

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(1000);
		// Static dropdown - using Select class
		WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(currency);
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		int i = 0;
		while (i < 2) {
			driver.findElement(By.id("hrefIncChd")).click();
			i++;
		}
		i = 0;
		do {
			driver.findElement(By.id("hrefIncInf")).click();
			i++;
		} while (i < 3);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult, 2 Child, 3 Infant");
		driver.findElement(By.id("btnclosepaxoption")).click();
		// Dynamic Dropdown with indexes
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		// driver.findElement(By.xpath("(//a[@value='BLR'])[1]")).click();
		driver.findElement(By.cssSelector("div[id='glsctl00_mainContent_ddl_originStation1_CTNR'] a[value='BLR']"))
				.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		Thread.sleep(500);
		// driver.findElement(By.xpath("(//*[text()='26'])[1]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		Thread.sleep(500);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("Return Calendar is Enabled ");
			Assert.assertTrue(true);
		} else
			Assert.assertTrue(false);

		// driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		Thread.sleep(500);
		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		// written by own
//		int num=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a")).size();
//		for (i=1;i<=num;i++)
//		{
//			System.out.println(driver.findElement(By.xpath("(//li[@class='ui-menu-item'])["+i+"]")).getText());
//		}
//		System.out.println(driver.findElement(By.xpath("//li[@class='ui-menu-item'] //a[text()='India']")).getText());
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//li[@class='ui-menu-item'] //a[text()='India']")).click();

		// from the class
		//Dynamic Dropdowns
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));

		for (WebElement option : options) {
			System.out.println(option.getText());
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

		// driver.close();
	}

}
