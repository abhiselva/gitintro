import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLink {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//limiting webdriver scope to check only on footer section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//List<WebElement> linkdriver = footerdriver.findElements(By.xpath("//tr/td/ul/li/a"));
		//WebElement linkdriver = footerdriver.findElement(By.xpath("//tr/td/ul/li/a"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		int linkcount = footerdriver.findElements(By.tagName("a")).size();
		String[] linkurl = new String[linkcount];
		for (int i=0;i<linkcount;i++)
		{
			linkurl[i] = footerdriver.findElements(By.tagName("a")).get(i).getAttribute("href");
		}
		
//		HttpURLConnection conn = (HttpURLConnection) new URL(linkurl[0]).openConnection();
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int respCode = conn.getResponseCode();
//		System.out.println(respCode);
//		
		//Soft Assertion can be used instead of hard assertion so that the test will continue till the end and avoid coming out after one failure
		SoftAssert a = new SoftAssert();
		
		//from rahul code
//		List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));
//	      SoftAssert a =new SoftAssert();
//
//	      for(WebElement link : links)
//	      {
//	          String url= link.getAttribute("href");
//	          HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
//	          conn.setRequestMethod("HEAD");
//	          conn.connect();
//	          int respCode = conn.getResponseCode();
//	          System.out.println(respCode);
//	          a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);
//
//	      }
		
		for (int i=0;i<linkcount;i++)
		{
			HttpURLConnection conn = (HttpURLConnection) new URL(linkurl[i]).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode +" : "+ linkurl[i]);
			a.assertTrue(respCode < 400, linkurl[i] +": this link is broken");
			
			//Assert.assertFalse(respCode > 400);
//			if (respCode > 400)
//			{
//				System.out.println(linkurl[i] +": this link is broken");
//				break;
//				
//			}
			
		a.assertAll();
		}
		
	}

}
