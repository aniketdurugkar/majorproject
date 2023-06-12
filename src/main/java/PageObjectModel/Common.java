package PageObjectModel;

import org.testng.asserts.SoftAssert;

public class Common {

	public static void commonassert(String at, String et, String msg) {

		SoftAssert ca = new SoftAssert();
		ca.assertEquals(at, et, msg);
		ca.assertAll();
	}
	
	public static void doubleassert(Double at, Double et, String msg) {

		SoftAssert ca = new SoftAssert();
		ca.assertEquals(at, et, msg);
		ca.assertAll();
	}
}
