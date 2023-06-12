package test;

import org.testng.annotations.Test;

import PageObjectModel.Common;
import PageObjectModel.CostAddObjects;
import Resources.Base;
import Resources.Constant;

public class VerifyCostAdd extends Base {

	@Test
	public void Costadd() {

		// Iphone
		CostAddObjects CAO = new CostAddObjects(driver);

		CAO.Searchbar().sendKeys(Constant.s1);

		CAO.Searchicon().click();

		CAO.Iphoneimg().click();

		String ip = CAO.Iphoneprice().getText();

		double iphonecost = Double.parseDouble(ip.substring(1));

		CAO.Addcart().click();

		// Samsung Tab
		CAO.Searchbar().clear();

		CAO.Searchbar().sendKeys(Constant.s2);

		CAO.Searchicon().click();

		CAO.Samtabimage().click();

		String st = CAO.Samtabprice().getText();

		double Tabprice = Double.parseDouble(st.substring(1));

		CAO.Addcart().click();

		// Cost addition
		try {
			CAO.Cart().click();
		} catch (Exception e) {
			CAO.Cart().click();
		}

		String T = CAO.Total().getText();

		double Total = Double.parseDouble(T.substring(1));

		double sum = iphonecost + Tabprice;

		String msg = "Addition mismatch";

		Common.doubleassert(sum, Total, msg);

	}

}
