package info.tasks5.sum10;

import static org.junit.Assert.*;
import org.junit.Test;

public class Sum10Test {

	@Test
	public void testSumValue() {
		assertNotNull(Sum10.sumValue());
		assertEquals(15, Sum10.sumValue());
		assertTrue(Sum10.sumValue()>10||20<Sum10.sumValue());
	}
}