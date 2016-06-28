package com.omer.JUnit;

import java.util.Vector;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.omer.FlipGame.FlipGame;

public class UnitTests {

	static boolean allPassed = true;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Starting tests.");
	}
	
	@Test
	public void testFlip() {
		// Test 1: Check for non-empty strings.
		FlipGame tester = new FlipGame();
		Vector<String> expected = new Vector<String>();
		expected.add("----++-++");
		expected.add("++-----++");
		expected.add("++--++---");
		
		Vector<String> flipped = tester.flip("++--++-++");
		assertEquals(expected, flipped);
		
		// Test 2: Check for empty string
		flipped = tester.flip("");
		assertEquals(new Vector<String>(), flipped);
	}
	
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Finished tests.");
		if (allPassed) System.out.println("All tests were successfull.");
	}
}
