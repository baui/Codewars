/*
 * ReverseWordsTest.java
 * 
 * Created : Feb 10, 2018
 */
package eu.tbauer.codewars.kyu6;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ReverseWordsTest {

	@Test
	public void testSomething() {
		assertEquals(ReverseWords.reverseWords("I like eating"), "eating like I");
		assertEquals(ReverseWords.reverseWords("I like flying"), "flying like I");
		assertEquals(ReverseWords.reverseWords("The world is nice"), "nice is world The");
	}

}
