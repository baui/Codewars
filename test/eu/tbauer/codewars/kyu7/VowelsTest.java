/*
 * VowelsTest.java
 * 
 * Created : Feb 14, 2018
 */
package eu.tbauer.codewars.kyu7;

import static org.junit.Assert.*;

import org.junit.Test;



public class VowelsTest {

	@Test
	public void testCase1() {
		assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
	}

}
