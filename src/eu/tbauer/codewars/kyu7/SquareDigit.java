/*
 * SquareDigit.java
 * 
 * Created : Feb 10, 2018
 */
package eu.tbauer.codewars.kyu7;

/**
 * Welcome. In this kata, you are asked to square every digit of a number.
 * For example, if we run 9119 through the function, 811181 will come out, because
 * 92 is 81 and 12 is 1.
 * Note: The function accepts an integer and returns an integer
 * 
 * 
 * https://www.codewars.com/kata/546e2562b03326a88e000020
 *
 * @author Tomas Bauer (mail@tbauer.eu)
 */
public class SquareDigit {

	public int squareDigits(int n) {
		String result = "";
		for (char c : String.valueOf(n).toCharArray()) {
			result += (int) Math.pow(Integer.valueOf(String.valueOf(c)), 2);
		}
		return Integer.valueOf(result);
	}
}
