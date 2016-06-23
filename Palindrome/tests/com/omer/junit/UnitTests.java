package com.omer.junit;


import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.omer.Palindrome.Palindrom;

public class UnitTests {

	static boolean failed = false;
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Starting tests.");
	}
	
	@Test
	public void testIsPalindrome() {
		try {
			Palindrom tester = new Palindrom();
			assertEquals("0 is a palindrome", true, tester.isPalindrome(0));
			assertEquals("-1 is not a palindrome", false, tester.isPalindrome(-1));
			assertEquals("123321 is a palindrome", true, tester.isPalindrome(123321));
		} catch (AssertionError e) {
			failed = true;
		}
	}
	
	@Test
	public void testIsPalindromeWithoutExtraSpace() {
		try {
			Palindrom tester = new Palindrom();
			assertEquals("0 is a palindrome", true, tester.isPalindromeWithoutExtraSpace(0));
			assertEquals("-1 is not a palindrome", false, tester.isPalindromeWithoutExtraSpace(-1));
			assertEquals("123321 is a palindrome", true, tester.isPalindromeWithoutExtraSpace(123321));
		} catch (AssertionError e) {
			failed = true;
		}
	}

	public void testIsThisStringAPalindrome() {
		try {
			Palindrom tester = new Palindrom();
			assertEquals("aabbaa is a valid palindrome", true, tester.isThisStringAPalindrome("aabbaa"));
			assertEquals("aabaa is a valid palindrome", false, tester.isThisStringAPalindrome("aabaa"));
			assertEquals("aabbcc can form a valid palindrome", true, tester.isThisStringAPalindrome("aabbcc"));
		} catch (AssertionError e) {
			failed = true;
		}
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("End of tests. All tests successful.");
		if(!failed) System.out.println("All tests executed successfully.");
	}
	
	
}
