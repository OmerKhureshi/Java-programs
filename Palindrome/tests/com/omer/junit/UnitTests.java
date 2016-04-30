package com.omer.junit;


import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.omer.Palindrome.Palindrom;

public class UnitTests {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Starting tests.");
	}
	
	@Test
	public void testIsPalindrome() {
		Palindrom tester = new Palindrom();
		assertEquals("0 is a palindrome", true, tester.isPalindrome(0));
		assertEquals("-1 is not a palindrome", false, tester.isPalindrome(-1));
		assertEquals("123321 is a palindrome", true, tester.isPalindrome(123321));
	}
	
	@Test
	public void testIsPalindromeWithoutExtraSpace() {
		Palindrom tester = new Palindrom();
		assertEquals("0 is a palindrome", true, tester.isPalindromeWithoutExtraSpace(0));
		assertEquals("-1 is not a palindrome", false, tester.isPalindromeWithoutExtraSpace(-1));
		assertEquals("123321 is a palindrome", true, tester.isPalindromeWithoutExtraSpace(123321));
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("End of tests. All tests successful.");
	}
	
	
}
