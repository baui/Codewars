/*
 * ShortestWord.java
 * 
 * Created : Feb 10, 2018
 */
package eu.tbauer.codewars.kyu7;

/**
 * Simple, given a string of words, return the length of the shortest word(s).
 * String will never be empty and you do not need to account for different data
 * types.
 * 
 * https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9
 *
 * @author Tomas Bauer (mail@tbauer.eu)
 */
public class ShortestWord {

	public static int findShort(String s) {
		
		int shortest = Integer.MAX_VALUE;
		
		for (String word : s.split(" ")) {
			if (word.length() < shortest)
				shortest = word.length();
		}
		
		return shortest;
	}

}
