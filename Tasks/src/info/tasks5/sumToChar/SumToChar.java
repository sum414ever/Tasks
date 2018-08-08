package info.tasks5.sumToChar;

import java.util.logging.Logger;

public class SumToChar {

	private static Logger logger = Logger.getLogger(SumToChar.class.getName());

	public static void main(String[] args) {
		int sum = 0;

		String s = Integer.toString(12345);
		char[] str = s.toCharArray();

		for (int i = 0; i < str.length; i++) {
			int b = Character.getNumericValue(str[i]);
			sum += b;
		}
		logger.info("" + sum);
	}

}
