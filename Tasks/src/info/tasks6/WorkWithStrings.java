package info.tasks6;

import java.util.logging.Logger;

public class WorkWithStrings {

	private static Logger log = Logger.getLogger(WorkWithStrings.class.getName());

	public static void main(String[] args) {
		log.info("\n" + getMultiStringResult(9, 12345));
	}

	private static String getMultiStringResult(int num1, int num2) {
		String stringResult = "";
		String totalStringLong = String.valueOf(num1 * num2);

		stringResult += getUpacesAmt(totalStringLong.length() - String.valueOf(num1).length()) + num1 + "\n";
		stringResult += getUpacesAmt(totalStringLong.length() - String.valueOf(num2).length()) + num2 + "\n";

		stringResult += getCicleMultipl(num1, num2, totalStringLong);

		stringResult += getUnderLineAmt(totalStringLong.length()) + "\n";

		stringResult += totalStringLong;

		return stringResult;
	}

	private static String getCicleMultipl(int num1, int num2, String totalStringLong) {
		char[] num1char = Integer.toString(num1).toCharArray();

		char[] num2char = new StringBuffer(Integer.toString(num2)).reverse().toString().toCharArray();

		int numUnderLine = 0;
		if (String.valueOf(num1).length() > String.valueOf(num2).length()) {
			numUnderLine = String.valueOf(num1).length();
		} else {
			numUnderLine = String.valueOf(num2).length();
		}

		String cicleResult = getUpacesAmt(totalStringLong.length() - getUnderLineAmt(numUnderLine).length())
				+ getUnderLineAmt(numUnderLine) + "\n";

		if (num1char.length != 1 && num2char.length != 1) {
			String mult = "";
			for (int i = 0; i < num2char.length; i++) {
				mult = Integer.toString(num1 * Character.getNumericValue(num2char[i]));
				cicleResult += getUpacesAmt(totalStringLong.length() - mult.length() - i) + mult + "\n";
			}
		}
		if (num1char.length != 1 && num2char.length == 1)
			cicleResult = "";
		if (num1char.length == 1 && num2char.length != 1)
			cicleResult = "";
		

		return cicleResult;

	}

	private static String getUnderLineAmt(int numUnderLine) {
		String underlines = "";
		for (int j = 0; j < numUnderLine; j++) {

			underlines += "_";
		}
		return underlines;
	}

	private static String getUpacesAmt(int i) {
		String spaces = "";
		for (int j = 0; j < i; j++) {

			spaces += " ";
		}
		return spaces;
	}

}
