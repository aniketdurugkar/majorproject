package test;

import org.testng.annotations.Test;
import PageObjectModel.Common;
import PageObjectModel.LoginObjects;
import PageObjectModel.RegisterObjects;
import Resources.Base;

public class VerifyLogin extends Base {

	@Test
	public void Login() {

		LoginObjects LP = new LoginObjects(driver);

		LP.Myaccountclick().click();
		LP.Loginclick().click();

		String actualtext = LP.Loginmsg().getText();
		String expectedtext = "Returning Customer";
		String errormsg = "Not working";

		Common.commonassert(actualtext, expectedtext, errormsg);

		LP.Email().sendKeys(RegisterObjects.getEmail());
		LP.Password().sendKeys(RegisterObjects.getPassword());
		LP.Clicklogin().click();

	}

}
