/*
 * PhoneNumbersTest.java
 *
 * Created: 16. 2. 2018
 */
package eu.tbauer.codewars.kyu6;

import static org.junit.Assert.*;

import org.junit.Test;

public class PhoneNumbersTest {

	@Test
	  public void tests() {
	    assertEquals("(123) 456-7890", PhoneNumbers.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
	  }

}
