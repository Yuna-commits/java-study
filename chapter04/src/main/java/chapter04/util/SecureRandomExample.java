package chapter04.util;

import java.security.SecureRandom;

public class SecureRandomExample {

	public static void main(String[] args) {
		SecureRandom rand = new SecureRandom();

		String key = "";
		for (int i = 0; i < 10; i++) {
			int token = rand.nextInt(126)+33;
			key += (Character.toString((char) token));
		}
		System.out.println("key: " + key);
	}

}
