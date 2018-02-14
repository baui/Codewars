/*
 * ShortestWordTest.java
 * 
 * Created : Feb 14, 2018
 */
package eu.tbauer.codewars.kyu7;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ShortestWordTest {

	@Test
	public void findShort() throws Exception {
		assertEquals(3, ShortestWord.findShort("bitcoin take over the world maybe who knows perhaps"));
		assertEquals(3, ShortestWord.findShort("turns out random test cases are easier than writing out basic ones"));
	}

}
