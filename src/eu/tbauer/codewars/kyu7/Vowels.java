package eu.tbauer.codewars.kyu7;

/**
 * Return the number (count) of vowels in the given string.
 * We will consider a, e, i, o, and u as vowels for this Kata.
 * The input string will only consist of lower case letters and/or spaces.
 * 
 * https://www.codewars.com/kata/54ff3102c1bad923760001f3
 * 
 * @author Tomas Bauer (mail@tbauer.eu)
 */
public class Vowels {

	public static int getCount(String str) {
		int vowelsCount = 0;
		for (char c : str.toCharArray()) {
			if (c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u') {
				vowelsCount++;
			}
		}
		return vowelsCount;
	}
}