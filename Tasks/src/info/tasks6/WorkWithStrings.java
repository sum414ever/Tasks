package info.tasks6;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class WorkWithStrings {

	private static StringBuilder sb = new StringBuilder();
	private static StringBuilder sb1 = new StringBuilder();
	private static Logger log = Logger.getLogger(WorkWithStrings.class.getName());
	static int a, b;

	public static List<String> mult() {
		String str = Integer.toString(b);
		char[] charMas = str.toCharArray();
		List<String> mult = new ArrayList<>();
		for (int i = 0; i < charMas.length; i++) {
			int e = Character.getNumericValue(charMas[i]);
			int sum = e * a;
			String sumStr = Integer.toString(sum);
			mult.add(sumStr);
		}
		return mult;

	}

	public static int stringLeght() {
		String k = Integer.toString(a * b);
		char[] sizeMaxMult = k.toCharArray();
		int stringLeght = 0;
		for (int i = 0; i <= sizeMaxMult.length; i++) {
			stringLeght = i;
		}
		return stringLeght;

	}

	public static List<String> spacesToString() {

		String s = "";
		List<String> spaces = new ArrayList<>();
		for (int i = 1; i < stringLeght(); i++) {
			s += " ";
			spaces.add(s);
		}
		return spaces;

	}

	public static List<String> underline() {

		String w = "_";
		List<String> underline = new ArrayList<>();
		for (int i = 0; i <= stringLeght(); i++) {
			w += "_";
			underline.add(w);
		}
		return underline;

	}

	public static void main(String[] args) {
		a = 12345;
		b = 123;
		String aStr = Integer.toString(a);
		String bStr = Integer.toString(b);
		int c = stringLeght();
		List<String> spaces = spacesToString();
		List<String> underline = underline();

		sb.append(spaces.get(c - aStr.length() - 1) + a).append(System.getProperty("line.separator"))
				.append(spaces.get(c - bStr.length() - 1) + b).append(System.getProperty("line.separator"))
				.append(spaces.get(c - aStr.length() - 1) + underline.get(aStr.length() - 2));

		List<String> mult = mult();

		if (mult.size() == 1) {
			sb1.append(mult.get(0)).append(System.getProperty("line.separator")).append(underline.get(c - 2));
		}
		if (mult.size() == 2) {

			sb1.append(spaces.get(c - mult.get(1).length() - 1) + mult.get(1))
					.append(System.getProperty("line.separator")).append(mult.get(0))
					.append(System.getProperty("line.separator")).append(underline.get(c - 2));
		}
		if (mult.size() == 3) {
			sb1.append(spaces.get(c - mult.get(2).length() - 1) + mult.get(2))
					.append(System.getProperty("line.separator"))
					.append(spaces.get(c - mult.get(1).length() - 2) + mult.get(1))
					.append(System.getProperty("line.separator")).append(mult.get(0))
					.append(System.getProperty("line.separator")).append(underline.get(c - 2));
		}
		if (mult.size() == 4) {
			sb1.append(spaces.get(c - mult.get(3).length() - 1) + mult.get(3))
					.append(System.getProperty("line.separator"))
					.append(spaces.get(c - mult.get(2).length() - 2) + mult.get(2))
					.append(System.getProperty("line.separator"))
					.append(spaces.get(c - mult.get(1).length() - 3) + mult.get(1))
					.append(System.getProperty("line.separator")).append(mult.get(0))
					.append(System.getProperty("line.separator")).append(underline.get(c - 2));
		}
		if (mult.size() == 5) {
			sb1.append((spaces.get(c - mult.get(4).length() - 1) + mult.get(4)))
					.append(System.getProperty("line.separator"))
					.append((spaces.get(c - mult.get(3).length() - 2) + mult.get(3)))
					.append(System.getProperty("line.separator"))
					.append(spaces.get(c - mult.get(2).length() - 3) + mult.get(2))
					.append(System.getProperty("line.separator"))
					.append(spaces.get(c - mult.get(1).length() - 4) + mult.get(1))
					.append(System.getProperty("line.separator")).append(mult.get(0))
					.append(System.getProperty("line.separator")).append(underline.get(c - 2));
		}
		if (mult.size() == 6) {
			sb1.append((spaces.get(c - mult.get(5).length() - 1) + mult.get(5)))
					.append(System.getProperty("line.separator"))
					.append((spaces.get(c - mult.get(4).length() - 2) + mult.get(4)))
					.append(System.getProperty("line.separator"))
					.append((spaces.get(c - mult.get(3).length() - 3) + mult.get(3)))
					.append(System.getProperty("line.separator"))
					.append(spaces.get(c - mult.get(2).length() - 4) + mult.get(2))
					.append(System.getProperty("line.separator"))
					.append(spaces.get(c - mult.get(1).length() - 5) + mult.get(1))
					.append(System.getProperty("line.separator")).append(mult.get(0))
					.append(System.getProperty("line.separator")).append(underline.get(c - 2));

		}

		log.info("\n" + sb + "\n" + sb1 + "\n" + a * b);

	}
}
