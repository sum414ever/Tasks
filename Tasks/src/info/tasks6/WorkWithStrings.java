package info.tasks6;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class WorkWithStrings {
	private static StringBuilder sb = new StringBuilder();
	private static Logger log = Logger.getLogger(WorkWithStrings.class.getName());
	static int a = 1234, b = 123;

	public static void main(String[] args) {
		List<String> space = space();
		List<Integer> list = mult();

		sb.append(System.getProperty("line.separator")).append(space.get(1) + a)
				.append(System.getProperty("line.separator")).append(space.get(2) + b)
				.append(System.getProperty("line.separator")).append("   ___")
				.append(System.getProperty("line.separator")).append(space.get(1) + list.get(2))
				.append(System.getProperty("line.separator")).append(space.get(0) + list.get(1))
				.append(System.getProperty("line.separator")).append(list.get(0))
				.append(System.getProperty("line.separator")).append("______")
				.append(System.getProperty("line.separator")).append(a * b);
		log.info("" + sb);

	}

	public static List<Integer> mult() {
		String c = Integer.toString(b);
		char[] charMas = c.toCharArray();
		List<Integer> mult = new ArrayList<>();
		for (int i = 0; i < charMas.length; i++) {
			int d = Character.getNumericValue(charMas[i]);
			mult.add(d * a);
		}
		return mult;

	}

	public static List<String> space() {
		List<Integer> list = mult();
		String s = "";
		List<String> space = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			s +=" ";
			space.add(s);
		}
		return space;
	}
}
