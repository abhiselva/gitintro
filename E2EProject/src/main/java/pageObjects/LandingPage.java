package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;

	private By login = By.cssSelector("a[href*=\"sign_in\"]");
	By title = By.xpath("//h2[contains(text(),'Featured Courses')]");
	By navigation = By.cssSelector(".nav.navbar-nav.navbar-right");
	By btnText = By.cssSelector(".btn.btn-primary");
	By nothanks = By.xpath("//button[contains(text(),'NO THANKS')]");
	private By header = By.cssSelector("div[class*=\"video-banner\"] p");
	
	
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getnothanks() {
		return driver.findElement(nothanks);
	}
	
	public WebElement getLogin() {
		return driver.findElement(login);
	}
	
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	
	public WebElement getNav() {
		return driver.findElement(navigation);
	}
	
	public WebElement getButtonText() {
		return driver.findElement(btnText);
	}
	public WebElement getHeader() {
		return driver.findElement(header);
	}
}
