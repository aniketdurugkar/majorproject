package test;

import java.io.IOException;
import org.testng.annotations.Test;
import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import PageObjectModel.Common;
import PageObjectModel.RegisterObjects;
import Resources.Base;
import Resources.Constant;

public class VerifyRegister extends Base {

	String error = "Process Failed";

	@Test(priority = 0)
	public void Register() throws IOException {

		RegisterObjects RP = new RegisterObjects(driver);

		RP.Myaccountclick().click();
		RP.Registerclick().click();

		//String actualText = RP.Registermsg().getText();
		String expectedtext = "Register Account";
		Common.commonassert(RP.Registermsg().getText(), expectedtext, error);

		RP.Firstname().sendKeys(Constant.getFirstname());

		RP.Lastname().sendKeys(Constant.getLastname());

		RP.Email().sendKeys(RegisterObjects.getEmail());

		RP.Telephone().sendKeys(Constant.getTelephone());

		RP.Password().sendKeys(RegisterObjects.getPassword());

		RP.Repass().sendKeys(RegisterObjects.getPassword());

		Boolean Privacypolicy = RP.Privacybox().isSelected();

		if (Privacypolicy.equals(false)) {
			RP.Privacybox().click();
		}

		RP.Continueclick().click();

		//String at = RP.SuccessReg().getText();
		String et = "Your Account Has Been Created!";
		Common.commonassert(RP.SuccessReg().getText(), et, error);

	}

	@Test(priority = 1)
	public void InvalidR1() throws IOException {
		RegisterObjects RP = new RegisterObjects(driver);

		RP.Myaccountclick().click();
		RP.Registerclick().click();

		//String actualText = RP.Registermsg().getText();
		String expectedtext = "Register Account";
		//Common.commonassert(RP.Registermsg().getText(), expectedtext, error);

		RP.Continueclick().click();

		Shutterbug.shootPage(driver, Capture.FULL_SCROLL).save("E:\\testing\\SS\\Reg fail");

		String Errort = RP.Errorreg().getText();
		String et = "Warning: You must agree to the Privacy Policy!";		
		Common.commonassert("Errort", et, error);
	
	System.out.println("AAA");
	}

}
