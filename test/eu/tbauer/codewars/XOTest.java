package eu.tbauer.codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * Check to see if a string has the same amount of 'x's and 'o's. The method
 * must return a boolean and be case insensitive. The string can contain any
 * char.
 *
 * @author Tomas Bauer
 */
public class XOTest {
	@Test
	public void testSomething1() {
		assertEquals(true, XO.getXO("xxxooo"));
	}

	@Test
	public void testSomething2() {
		assertEquals(true, XO.getXO("xxxXooOo"));
	}

	@Test
	public void testSomething3() {
		assertEquals(false, XO.getXO("xxx23424esdsfvxXXOOooo"));
	}

	@Test
	public void testSomething4() {
		assertEquals(false, XO.getXO("xXxxoewrcoOoo"));
	}

	@Test
	public void testSomething5() {
		assertEquals(false, XO.getXO("XxxxooO"));
	}

	@Test
	public void testSomething6() {
		assertEquals(true, XO.getXO("zssddd"));
	}

	@Test
	public void testSomething7() {
		assertEquals(false, XO.getXO("Xxxxertr34"));
	}
}