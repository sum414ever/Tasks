package info.tasks6;

import static org.junit.Assert.*;

import org.junit.Test;

public class WorkWithStringsTest {

	@Test
	public void testMult() {
		assertNotNull(WorkWithStrings.mult());
		
	}

	@Test
	public void testSpacesToString() {
		assertNotNull(WorkWithStrings.spacesToString());

	}

	@Test
	public void Underline() {
		assertNotNull(WorkWithStrings.underline());
	}

	@Test
	public void testStringLeght() {
		assertNotNull(WorkWithStrings.stringLeght());
	}

}
