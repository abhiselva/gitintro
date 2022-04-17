import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CalendarOperation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		Thread.sleep(5000);
		driver.findElement(By.id("travel_date")).click();
		//Oct 30
		
		//boolean isoctober = driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("October");
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("October"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		
		String date="30";
		//in calendar we will have old month days, current month days and next month days to we need to make sure select the current month's date!!
		//class names are like - old day, day , new day - Used class = 'day' to narrow down to current month's days
		List<WebElement> dates=driver.findElements(By.xpath("//td[@class='day']"));
		int count=driver.findElements(By.xpath("//td[@class='day']")).size();
		for(int i=1;i<count;i++)
		{
			if(dates.get(i).getText().equalsIgnoreCase(date))
					{
						dates.get(i).click();
					}
		}
		
		
	}

}
