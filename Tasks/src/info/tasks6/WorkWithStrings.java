package info.tasks6;

import java.util.logging.Logger;

public class WorkWithStrings {

	private static Logger log = Logger.getLogger(WorkWithStrings.class.getName());

	public static void main(String[] args) {
		log.info("\n" + getMultiStringResult(12345, 2));
	}

	private static String getMultiStringResult(int num1, int num2) {
		String stringResult = "";
		String totalStringLong = String.valueOf(num1 * num2);

		stringResult += spacesAmt(totalStringLong.length() - String.valueOf(num1).length()) + num1 + "\n";
		stringResult += spacesAmt(totalStringLong.length() - String.valueOf(num2).length()) + num2 + "\n";

		stringResult += cicleMultipl(num1, num2, totalStringLong);

		stringResult += underLineAmt(totalStringLong.length()) + "\n";

		stringResult += totalStringLong;

		return stringResult;
	}

	private static String cicleMultipl(int num1, int num2, String totalStringLong) {

		char[] num2char = new StringBuffer(Integer.toString(num2)).reverse().toString().toCharArray();
		
		int numUnderLine = 0;
		if (String.valueOf(num1).length() > String.valueOf(num2).length()) {
			numUnderLine = String.valueOf(num1).length();
		} else {
			numUnderLine = String.valueOf(num2).length();
		}

		String cicleResult = spacesAmt(totalStringLong.length() - underLineAmt(numUnderLine).length())
				+ underLineAmt(numUnderLine) + "\n";;
		
		if(num2char.length != 1) {
			String mult = "";
		for (int i = 0; i < num2char.length; i++) {
			mult = Integer.toString(num1 * Character.getNumericValue(num2char[i]));
			cicleResult += spacesAmt(totalStringLong.length() - mult.length() - i) + mult + "\n";
		}
		}else cicleResult = "";
		
		return cicleResult;

	}

	private static String underLineAmt(int numUnderLine) {
		String underlines = "";
		for (int j = 0; j < numUnderLine; j++) {

			underlines += "_";
		}
		return underlines;
	}

	private static String spacesAmt(int i) {
		String spaces = "";
		for (int j = 0; j < i; j++) {

			spaces += " ";
		}
		return spaces;
	}

}
