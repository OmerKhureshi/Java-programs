package com.omer.junit;


import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.omer.adddigits.AddDigits;

public class UnitTests {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Starting tests.");
	}
	
	@Test
	public void testAddDigits() {
		AddDigits tester = new AddDigits();
		assertEquals("Sum of digits of 789 must be equal to 6 ", 6, tester.addDigits(789));
		assertEquals("Sum of digits of 0 must be equal to 0 ", 0, tester.addDigits(0));
		assertEquals("Sum of digits of 1 must be equal to 1 ", 1, tester.addDigits(1));
	}
	
	@Test
	public void testdr() {
		AddDigits tester = new AddDigits();
		assertEquals("Sum of digits of 789 must be equal to 6 ", 6, tester.dr(789));
		assertEquals("Sum of digits of 0 must be equal to 0 ", 0, tester.dr(0));
		assertEquals("Sum of digits of 1 must be equal to 1 ", 1, tester.dr(1));
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("End of tests.");
	}
	
	
}
