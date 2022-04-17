package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public WebDriver driver;

	By email = By.id("user_email");
	By pswd = By.id("user_password");
	By loginbtn = By.xpath("//input[@type='submit']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getPassword() {
		return driver.findElement(pswd);
	}
	public WebElement getLogin() {
		return driver.findElement(loginbtn);
	}
}
