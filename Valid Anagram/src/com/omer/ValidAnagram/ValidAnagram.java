package com.omer.ValidAnagram;

import java.util.Arrays;

/**
 * Problem from leetcode.com (https://leetcode.com/problems/valid-anagram/)
 * 
 * Given two strings s and t, write a function to determine if t is an anagram
 * of s.
 * 
 * For example, s = "anagram", t = "nagaram", return true. s = "rat", t = "car",
 * return false.
 * 
 * Note: You may assume the string contains only lowercase alphabets.
 * 
 * TO DO: What if the inputs contain unicode characters? How would you adapt
 * your solution to such case?
 * 
 * @author Syed Omer Salar Khureshi
 *
 */
public class ValidAnagram {
	public static void main(String[] args) {
		System.out.println(new ValidAnagram().isAnagram("hello", "olleh"));
		System.out.println(new ValidAnagram().isAnagramCounter("hello", "olleh"));
		System.out.println(new ValidAnagram().isAnagramSort("hello", "olleh"));
	}
	
	
	/**
	 * Solution from leetcode.com (https://leetcode.com/articles/valid-anagram/)
	 * Time complexity - O(n)
	 */
	public boolean isAnagramCounter(String s, String t) {
		
		if (s.length() != t.length())
			return false;

		// Initiate counter array for all characters in English alphabet.
		int[] counter = new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			// Increment the counter at index position for each character if that character exists in first string
			counter[s.charAt(i) - 'a']++;
			// Decrement the counter at index position for each character if that character exists in second string
			counter[t.charAt(i) - 'a']--;
		}
		
		for (int i = 0; i < counter.length; i++) {
			if (counter[i] != 0) return false;
		}
		
		return true;
	}
	
	/**
	 * Convert string to character array and sort and compare.
	 */
	public boolean isAnagramSort(String s, String t) {
		
		if (s.length() != t.length())
			return false;

		char[] charS = s.toCharArray();
		char[] charT = t.toCharArray();

		Arrays.sort(charS);
		Arrays.sort(charT);
		
		for (int i = 0; i < charS.length; i++) {
			if (charS[i] != charT[i]) {
				return false;
			}
		}
		return true;
	}

	// Slow. Timed out in Leetcode.com online judge.
	public boolean isAnagram(String s, String t) {

		if (s.length() != t.length())
			return false;
		
		// Loop through all the characters in first string.
		for (int i = 0; i < s.length(); i++) {
			// Convert second string to lower case. Check if second string
			// contains characters in first string that we are looping through
			if (t.toLowerCase().contains("" + Character.toLowerCase(s.charAt(i)) + "") != true) {
				return false;
			}
		}
		for (int i = 0; i < t.length(); i++) {
			// Convert second string to lower case. Check if second string
			// contains characters in first string that we are looping through
			if (s.toLowerCase().contains("" + Character.toLowerCase(t.charAt(i)) + "") != true) {
				return false;
			}
		}
		return true;
	}
}
