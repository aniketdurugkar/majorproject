package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CostAddObjects {

	public WebDriver driver;

	private By searchbar = By.xpath("//input[@class='form-control input-lg']");

	private By searchicon = By.xpath("//button[@class='btn btn-default btn-lg']");

	private By iphoneimg = By.xpath("//img[@alt='iPhone']");

	private By iphoneprice = By.xpath("//h2[contains(text(),'$123.20')]");

	private By cartbutton = By.xpath("//button[@id='button-cart']");

	private By samtabimg = By.xpath("//img[@alt='Samsung Galaxy Tab 10.1']");

	private By samtabprice = By.xpath("//h2[contains(text(),'$241.99')]");

	private By cart = By.xpath("//span[@id='cart-total']");

	private By total = By.xpath("//td[contains(text(),'$365.19')]");

	public CostAddObjects(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement Searchbar() {
		return driver.findElement(searchbar);
	}

	public WebElement Searchicon() {
		return driver.findElement(searchicon);
	}

	public WebElement Iphoneimg() {
		return driver.findElement(iphoneimg);
	}

	public WebElement Iphoneprice() {
		return driver.findElement(iphoneprice);
	}

	public WebElement Addcart() {
		return driver.findElement(cartbutton);
	}

	public WebElement Samtabimage() {
		return driver.findElement(samtabimg);
	}

	public WebElement Samtabprice() {
		return driver.findElement(samtabprice);
	}

	public WebElement Cart() {
		return driver.findElement(cart);
	}

	public WebElement Total() {
		return driver.findElement(total);

	}

}
