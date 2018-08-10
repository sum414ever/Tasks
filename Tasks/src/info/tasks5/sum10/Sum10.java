package info.tasks5.sum10;

import java.util.logging.Logger;

public class Sum10 {

	private static Logger logger = Logger.getLogger(Sum10.class.getName());

	public static void main(String[] args) {
		
		logger.info(" " + sumValue());

	}
	public static int sumValue() {
		int n = 12345;
		int sum = 0;
		while (n != 0) {
			sum += (n % 10);
			n /= 10;
		}
		return sum;
	}

}
