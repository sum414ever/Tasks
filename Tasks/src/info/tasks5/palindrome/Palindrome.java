package info.tasks5.palindrome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class Palindrome {
	private static Logger logger = Logger.getLogger(Palindrome.class.getName());

	public static void main(String[] args) {
		int palindrome = getPalindroms();
		logger.info("The max palindrome is " + palindrome);
	}

	public static int getPalindroms() {

		List<Integer> palindrome = new ArrayList<>();
		{
			for (int i = 9999; i > 999; i--) {
				for (int j = 9999; j > 999; j--) {
					int mult = i * j;
					if (isPalindrome(mult)) {
						palindrome.add(mult);
					}
				}
			}
		}
		return Collections.max(palindrome);
	}

	public static boolean isPalindrome(int mult) {
		String str2 = Integer.toString(mult);
		String reverse = new StringBuffer(str2).reverse().toString();
		if (str2.equals(reverse)) {
			return true;
		} else {
			return false;
		}

	}

}
