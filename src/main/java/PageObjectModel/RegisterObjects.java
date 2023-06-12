package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Resources.Constant;

public class RegisterObjects {

	public WebDriver driver;

	private By Myaccount = By.xpath("//span[contains(text(),'My Account')]");

	private By Register = By.xpath("//a[contains(text(),'Register')]");

	private By Regmsg = By.xpath("//h1[contains(text(),'Register Account')]");

	private By first = By.xpath("//input[@id=\"input-firstname\"]");

	private By last = By.xpath("//input[@id=\"input-lastname\"]");

	private By email = By.xpath("//input[@id=\"input-email\"]");

	private By telephone = By.xpath("//input[@id=\"input-telephone\"]");

	private By password = By.xpath("//input[@id=\"input-password\"]");

	private By repass = By.xpath("//input[@id=\"input-confirm\"]");

	private By Checkbox = By.xpath("//input[@name='agree']");

	private By Continue = By.xpath("//input[@class='btn btn-primary']");

	private By Successreg = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
	
	private By errorreg = By.xpath("//*[@id=\"account-register\"]/div[1]");
	
	private static String Password = Constant.getPass();
	
	private static String Email = Constant.getEmail();

	public RegisterObjects(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement Myaccountclick() {
		return driver.findElement(Myaccount);
	}

	public WebElement Registerclick() {
		return driver.findElement(Register);
	}

	public WebElement Registermsg() {
		return driver.findElement(Regmsg);
	}

	public WebElement Firstname() {
		return driver.findElement(first);
	}

	public WebElement Lastname() {
		return driver.findElement(last);
	}

	public WebElement Email() {
		return driver.findElement(email);
	}

	public WebElement Telephone() {
		return driver.findElement(telephone);
	}

	public WebElement Password() {
		return driver.findElement(password);
	}

	public WebElement Repass() {
		return driver.findElement(repass);
	}

	public WebElement Privacybox() {
		return driver.findElement(Checkbox);
	}

	public WebElement Continueclick() {
		return driver.findElement(Continue);
	}

	public WebElement SuccessReg() {
		return driver.findElement(Successreg);
	}

	public static String getPassword() {
		return Password;
	}

	public static void setPassword(String password) {
		Password = password;
	}

	public static String getEmail() {
		return Email;
	}

	public static void setEmail(String email) {
		Email = email;
	}

	public WebElement Errorreg() {
		return driver.findElement(errorreg);
	}
	
}
