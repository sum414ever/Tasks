package info.tasks5.sumToChar;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumToCharTest {

	@Test
	public void testSumCharValue() {
		assertNotNull(SumToChar.sumCharValue());
		assertEquals(15, SumToChar.sumCharValue());
		assertTrue(SumToChar.sumCharValue() > 10 || 20 < SumToChar.sumCharValue());
	}

}
