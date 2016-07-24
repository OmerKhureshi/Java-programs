package com.omer.JUnit;

import com.omer.AddTwoNumbers.AddTwoNumbers;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UnitTest {
	
	static Boolean failed = false;
	
	@Before
	public void before() {
		System.out.println("Start of unit tests.");
	}
	
	@Test
	public void testAdd() {
		AddTwoNumbers tester = new AddTwoNumbers();
		try {
			assertEquals("Sum of 5 and 5 should be 10", 10, tester.add(5, 5));
			assertEquals("Sum of -5 and 10 should be 5", 5, tester.add(-5, 10));
			assertEquals("Sum of -100 and 10 should be 90", -90, tester.add(-100, 10));
			
		} catch (AssertionError e) {
			failed = true;
		}
	}
	
	@After
	public void after() {
		System.out.println("End of unit test.");
		if (!failed)
			System.out.println("All tests successful");
	}
	
}
