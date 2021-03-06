/*
 * XO.java
 *
 * Created: 9. 2. 2018
 */
package eu.tbauer.codewars.kyu7;

/**
 * Check to see if a string has the same amount of 'x's and 'o's. The method
 * must return a boolean and be case insensitive. The string can contain any
 * char.
 * 
 * https://www.codewars.com/kata/55908aad6620c066bc00002a
 *
 * @author Tomas Bauer
 */
public class XO {

	public static boolean getXO(String str) {

		int xo = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i) == 'x')
				xo++;
			if (str.toLowerCase().charAt(i) == 'o')
				xo--;
		}
		return xo == 0;
	}
}