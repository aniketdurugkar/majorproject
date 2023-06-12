package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TabsObjects {

	public WebDriver driver;
	
	private By desktop = By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Desktops')]");
	
	private By pc = By.xpath("//a[contains(text(),'PC (0)')]");
	
	private By textpc = By.xpath("//h2[contains(text(),'PC')]");
	
	private By landn = By.xpath("//a[@class='dropdown-toggle' and contains(text(),'Laptops & Notebooks')]");
	
	private By mac = By.xpath("//a[contains(text(),'Macs (0)')]");
	
	private By textmac = By.xpath("//h2[contains(text(),'Macs')]");
	
	private By compo = By.xpath("//a[@class=\"dropdown-toggle\" and contains(text(),'Components')]");
	
	private By scan = By.xpath("//a[contains(text(),'Scanners (0)')]");
	
	private By textscan = By.xpath("//h2[contains(text(),'Scanners')]");
	
	private By mp3 = By.xpath("//a[@class=\"dropdown-toggle\" and contains(text(),'MP3 Players')]");
	
	private By t15 = By.xpath("//a[contains(text(),'test 15 (0)')]");
	
	private By textt15 = By.xpath("//h2[contains(text(),'test 15')]");
	
	private By tablets = By.xpath("(//a[contains(text(),'Tablets')])[1]");
	
	private By texttablets = By.xpath("//h2[contains(text(),'Tablets')]");
	
	private By software = By.xpath("(//a[contains(text(),'Software')])[1]");
	
	private By textsoftware = By.xpath("//h2[contains(text(),'Software')]");
	
	private By pandp = By.xpath("(//a[contains(text(),'Phones & PDAs')])[1]");
	
	private By textpandp = By.xpath("//h2[contains(text(),'Phones & PDAs')]");
	
	private By camera = By.xpath("(//a[contains(text(),'Cameras')])[2]");
	
	
	
	public TabsObjects(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement Desktop() {
		return driver.findElement(desktop);
	}
	
	public WebElement PC() {
		return driver.findElement(pc);
	}

	public WebElement Textpc() {
		return driver.findElement(textpc);
	}
	
	public WebElement Landn() {
		return driver.findElement(landn);
	}
	
	public WebElement Mac() {
		return driver.findElement(mac);
	}
	
	public WebElement Textmac() {
		return driver.findElement(textmac);
	}
	
	public WebElement Component() {
		return driver.findElement(compo);
	}
	
	public WebElement Scanner() {
		return driver.findElement(scan);
	}
	
	public WebElement Textscan() {
		return driver.findElement(textscan);
	}
	
	public WebElement MP3() {
		return driver.findElement(mp3);
	}
	
	public WebElement Test15() {
		return driver.findElement(t15);
	}
	
	public WebElement Textt15() {
		return driver.findElement(textt15);
	}
	
	public WebElement Tablets() {
		return driver.findElement(tablets);
	}
	
	public WebElement Texttablets() {
		return driver.findElement(texttablets);
	}
	
	public WebElement Software() {
		return driver.findElement(software);
	}
	
	public WebElement Textsoftware() {
		return driver.findElement(textsoftware);
	}
	
	public WebElement Pandp() {
		return driver.findElement(pandp);
	}
	
	public WebElement Textpandp() {
		return driver.findElement(textpandp);
	}
	
	public WebElement Camera() {
		return driver.findElement(camera);
	}
	
}