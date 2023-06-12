package Resources;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class Generators {

	public static String result = RandomStringUtils.randomAlphabetic(4);

	static long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;

	public static String getSaltString() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 10) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;

	}

}
