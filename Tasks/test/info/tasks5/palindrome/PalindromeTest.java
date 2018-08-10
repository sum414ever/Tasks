package info.tasks5.palindrome;

import static org.junit.Assert.*;

import org.junit.Test;

import info.tasks5.palindrome.Palindrome;


public class PalindromeTest {
	
	

	@Test
	public void testGetPalindroms() {
		assertNotNull(Palindrome.getPalindroms());
		assertEquals(99000099, Palindrome.getPalindroms());
		assertTrue(Palindrome.getPalindroms()>10000000||200000000<Palindrome.getPalindroms());
		
	}

}
