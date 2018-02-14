/*
 * SquareDigitTest.java
 * 
 * Created : Feb 10, 2018
 */
package eu.tbauer.codewars.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SquareDigitTest {

	@Test
	public void test() {
		assertEquals(811181, new SquareDigit().squareDigits(9119));
	}

}
