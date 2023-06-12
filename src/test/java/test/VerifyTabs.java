package test;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import PageObjectModel.Common;
import PageObjectModel.TabsObjects;
import Resources.Base;

public class VerifyTabs extends Base {
	
	@Test
	public void Tabs() {
	
	TabsObjects TO = new TabsObjects(driver);
	
	Actions a = new Actions(driver);

	a.moveToElement(TO.Desktop()).perform();
	
	TO.PC().click();
	
	String at1 = TO.Textpc().getText();
	String et1 = "PC";
	String msg = "test failed";
	
	Common.commonassert(at1, et1, msg);
	
	a.moveToElement(TO.Landn()).perform();
	
	TO.Mac().click();
	
	String at2 = TO.Textmac().getText();
	String et2 = "Macs";
	
	Common.commonassert(at2, et2, msg);
	
	a.moveToElement(TO.Component()).perform();
	
	TO.Scanner().click();
	
	String at3 = TO.Textscan().getText();
	String et3 = "Scanners";
	
	Common.commonassert(at3, et3, msg);
	
	a.moveToElement(TO.MP3()).perform();
	
	TO.Test15().click();
	
	String at4 = TO.Textt15().getText();
	String et4 = "test 15";
	
	Common.commonassert(at4, et4, msg);
	
	TO.Tablets().click();
	
	String at5 = TO.Texttablets().getText();
	String et5 = "Tablets";
	
	Common.commonassert(at5, et5, msg);
	
	TO.Software().click();
	
	String at6 = TO.Textsoftware().getText();
	String et6 = "Software";
	
	Common.commonassert(at6, et6, msg);
	
	TO.Pandp().click();
	
	String at7 = TO.Textpandp().getText();
	String et7 = "Phones & PDAs";
	
	Common.commonassert(at7, et7, msg);
	
	TO.Camera().click();
	
	String at8 = TO.Camera().getText();
	String et8 = "Cameras";
	
	Common.commonassert(at8, et8, msg);
	
	}
	
}
