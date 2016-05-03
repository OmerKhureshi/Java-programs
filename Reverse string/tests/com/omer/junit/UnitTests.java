package com.omer.junit;


import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.omer.ReverseString.ReverseString;

public class UnitTests {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Starting tests.");
	}
	
	@Test
	public void testReverse() {
		ReverseString tester = new ReverseString();
		assertEquals("Reverse of hello is olleh", "olleh", tester.reverse("hello"));
		assertEquals("Reverse of hello is olleh", "dlrow", tester.reverse("world"));
		assertEquals("Reverse of hello is olleh", "remo", tester.reverse("omer"));
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("End of tests. All tests successful.");
	}
	
	
}
