package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base {
	public static WebDriver driver;
	public Properties prop;

	public void initializeDriver() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\Resources\\data.properties");
		prop = new Properties();
		prop.load(fis);

		String Browsername = prop.getProperty("browser");

		if (Browsername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (Browsername.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();

		} else if (Browsername.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();

		} else {
			System.out.println("Please choose a valid Browser");
		}

	}

	/*
	 * //add screenshot on error
	 * 
	 * @BeforeTest public void launchbrowser() throws IOException {
	 * initializeDriver(); driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); String url
	 * = prop.getProperty("url"); driver.get(url); }
	 */

	@BeforeMethod
	public void launchBrowser() throws IOException {

		initializeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String url = prop.getProperty("url");
		driver.get(url);

	}

	/*
	 * @AfterMethod public void quitBrowser() throws IOException {
	 * 
	 * driver.quit();
	 * 
	 * }
	 */
	@BeforeTest
	public void ExtentReport() {
		extentManager.setup();
	}

	@AfterTest
	public void endReport() {
		extentManager.endReport();
	}

	// To take the screenshot and store in one folder-
	public static String screenShot(WebDriver driver, String filename) {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\ScreenShot\\" + filename + "_" + dateName + ".png";
		File finalDestination = new File(destination);
		try {
			FileUtils.copyFile(source, finalDestination);
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;
	}

}
