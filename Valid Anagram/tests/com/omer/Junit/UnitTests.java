package com.omer.Junit;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.omer.ValidAnagram.ValidAnagram;

public class UnitTests {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Starting tests.");
	}
	
	@Test
	public void testIsAnagram() {
		ValidAnagram tester = new ValidAnagram();
		assertEquals("cinema and iceman are anagrams", true, tester.isAnagram("cinema", "iceman"));
		assertEquals("CINEMA and iceMaN are anagrams", true, tester.isAnagram("CINEMA", "iceMaN"));
		assertEquals("me and you are not anagrams", false, tester.isAnagram("me", "you"));
	}
	@Test
	public void testIsAnagramCounter() {
		ValidAnagram tester = new ValidAnagram();
		assertEquals("cinema and iceman are anagrams", true, tester.isAnagramCounter("cinema", "iceman"));
		assertEquals("CINEMA and iceMaN are anagrams", true, tester.isAnagramCounter("CINEMA", "iceMaN"));
		assertEquals("me and you are not anagrams", false, tester.isAnagramCounter("me", "you"));
	}
	@Test
	public void testIsAnagramSort() {
		ValidAnagram tester = new ValidAnagram();
		assertEquals("cinema and iceman are anagrams", true, tester.isAnagramSort("cinema", "iceman"));
		assertEquals("CINEMA and iceMaN are anagrams", true, tester.isAnagramSort("CINEMA", "iceMaN"));
		assertEquals("me and you are not anagrams", false, tester.isAnagramSort("me", "you"));
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("End of tests.");
	}
	
	
}
