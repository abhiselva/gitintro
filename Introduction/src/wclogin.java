import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class wclogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sabhi\\OneDrive\\Documents\\BrowserDrivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://digital.qc.alight.com/whitecap/");
		Thread.sleep(3000);
		driver.findElement(By.id("_ParticipantLogon20_WAR_ahcommonauthportlet_userId")).sendKeys("A300000007");
		driver.findElement(By.id("_ParticipantLogon20_WAR_ahcommonauthportlet_password")).sendKeys("A999999a");
		driver.findElement(By.id("_ParticipantLogon20_WAR_ahcommonauthportlet_enableNPVCheckbox")).click();
		driver.findElement(By.id("_ParticipantLogon20_WAR_ahcommonauthportlet_testCfgList[0].cfgValue")).sendKeys("P1ZB");
		driver.findElement(By.id("_ParticipantLogon20_WAR_ahcommonauthportlet_skipAACheckbox")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='tds-profile__close tds-ico-close']")).click();
		driver.findElement(By.id("_ParticipantLogon20_WAR_ahcommonauthportlet_udpSchema")).sendKeys("Z133805Z");
		driver.findElement(By.id("_ParticipantLogon20_WAR_ahcommonauthportlet_logOn")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='tds-profile__close tds-ico-close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Log out']")).click();
		driver.close();
	}

}
