package com.omer.JUnit;


import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.omer.SingleNumber.SingleNumber;

public class UnitTests {
	
	static Boolean failed = false;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Starting tests.");
	}
	
	
	@Test
	public void testFindUniqueNumberXOR() {
		SingleNumber singleNumber = new SingleNumber();
		try {
			assertEquals(singleNumber.findUniqueNumberXOR(new int[] { 5, 2, 1, 1, 3, 3, 2 }), 5);
			assertEquals(singleNumber.findUniqueNumberXOR(new int[] { 2, 2, 1}), 1);
		} catch (AssertionError e) {
			failed = true;
		}
	}

	@Test
	public void testFindUniqueNumberHashSet() {
		SingleNumber singleNumber = new SingleNumber();
		try {
			assertEquals(singleNumber.findUniqueNumberHashSet(new int[] { 5, 2, 1, 1, 3, 3, 2 }), 5);
			assertEquals(singleNumber.findUniqueNumberHashSet(new int[] { 2, 2, 1}), 1);
		} catch (AssertionError e) {
			failed = true;
		}
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("End of tests.");
		if (!failed) System.out.println("All tests succeded!");
	}

}
