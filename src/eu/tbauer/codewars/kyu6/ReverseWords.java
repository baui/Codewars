/*
 * ReverseWords.java
 * 
 * Created : Feb 10, 2018
 */
package eu.tbauer.codewars.kyu6;

import java.util.*;

/**
 * Complete the solution so that it reverses all of the words within the string
 * passed in.
 * 
 * https://www.codewars.com/kata/51c8991dee245d7ddf00000e
 *
 * @author Tomas Bauer (mail@tbauer.eu)
 */
public class ReverseWords {

	public static Object reverseWords(String str) {
		List<String> words = Arrays.asList(str.split(" "));
		Collections.reverse(words);
		return String.join(" ", words);
	}
}
