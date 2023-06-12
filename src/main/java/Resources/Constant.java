package Resources;

public class Constant {

	private static String Firstname = "xyz";

	private static String Lastname = "abc";

	static Long num = Generators.number;

	private static String telephone = Long.toString(num);

	private static String Email = Generators.getSaltString() + "@gmail.com";

	private static String pass = Generators.result;

	public static String s1 = "iphone";
	
	public static String s2 = "samsung";
	
	
	public static String getTelephone() {
		return telephone;
	}

	public static void setTelephone(String telephone) {
		Constant.telephone = telephone;
	}

	public static String getFirstname() {
		return Firstname;
	}

	public static void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public static String getLastname() {
		return Lastname;
	}

	public static void setLastname(String lastname) {
		Lastname = lastname;
	}

	public static String getEmail() {
		return Email;
	}

	public static void setEmail(String email) {
		Email = email;
	}

	public static String getPass() {
		return pass;
	}

	public static void setPass(String pass) {
		Constant.pass = pass;
	}

}
