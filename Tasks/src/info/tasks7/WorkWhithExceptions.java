package info.tasks7;

import java.util.logging.Logger;

public class WorkWhithExceptions {
	static private Logger log = Logger.getLogger(WorkWhithExceptions.class.getName());

	public static void main(String[] args) {
		new WorkWhithExceptions().exceptionsMetod();

	}

	void exceptionsMetod() {
		try {
			int a = 111;
			int b = 0;
			int c = a / b;
			log.info(c + " ");

		} catch (ArithmeticException e) {
			log.severe("Something was wrong");
			e.printStackTrace();

		}log.info("I`m still working");
	}

}
