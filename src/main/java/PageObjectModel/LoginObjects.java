package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObjects {

	public WebDriver driver;
	
	private By Myaccount = By.xpath("//span[contains(text(),'My Account')]");
	
	private By Login = By.xpath("//a[contains(text(),'Login')]");
	
	private By Logmsg = By.xpath("//h2[contains(text(),'Returning Customer')]");
	
	private By email = By.xpath("//input[@id='input-email']");
	
	private By pass = By.xpath("//input[@id='input-password']");
	
	private By logclk = By.xpath("//input[@value='Login']");
	
	
	public LoginObjects(WebDriver driver2) {
		this.driver = driver2;
	}
	
	public WebElement Myaccountclick() {
		return driver.findElement(Myaccount);
	}
	
	public WebElement Loginclick() {
		return driver.findElement(Login);
	}
	
	public WebElement Loginmsg() {
		return driver.findElement(Logmsg);
	}
	
	public WebElement Email() {
		return driver.findElement(email);
	}
	
	public WebElement Password() {
		return driver.findElement(pass);
	}
	
	public WebElement Clicklogin() {
		return driver.findElement(logclk);
	}
	
}
