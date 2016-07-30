package com.omer.JUnit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.omer.Wiggle.WiggleSequence;

public class UnitTests {
	static Boolean failed = false;

	@Before
	public void before() {
		System.out.println("Start of unit tests.");
	}

	@Test
	public void testWiggleMaxLength() {
		WiggleSequence tester = new WiggleSequence();
		try {
			assertEquals("Wiggle sequence of max length for the [1,7,4,9,2,5] array is 6", 6,
					tester.wiggleMaxLength(new int[] { 1, 7, 4, 9, 2, 5 }));

			assertEquals("Wiggle sequence of max length for the [1,17,5,10,13,15,10,5,16,8] array is 7", 7,
					tester.wiggleMaxLength(new int[] { 1,17,5,10,13,15,10,5,16,8 }));
			
			assertEquals("Wiggle sequence of max length for the [1,2,3,4,5,6,7,8,9] array is 2.", 2,
					tester.wiggleMaxLength(new int[] { 1,2,3,4,5,6,7,8,9 }));

			assertEquals("Wiggle sequence of max length for the very long array is 67.", 67,
					tester.wiggleMaxLength(new int[] { 33, 53, 12, 64, 50, 41, 45, 21, 97, 35, 47, 92, 39, 0, 93, 55, 40, 46, 69, 42, 6, 95,
							51, 68, 72, 9, 32, 84, 34, 64, 6, 2, 26, 98, 3, 43, 30, 60, 3, 68, 82, 9, 97, 19, 27, 98, 99, 4, 30, 96,
							37, 9, 78, 43, 64, 4, 65, 30, 84, 90, 87, 64, 18, 50, 60, 1, 40, 32, 48, 50, 76, 100, 57, 29, 63, 53,
							46, 57, 93, 98, 42, 80, 82, 9, 41, 55, 69, 84, 82, 79, 30, 79, 18, 97, 67, 23, 52, 38, 74, 15 }));
			
		} catch (AssertionError e) {
			System.out.println("error");
			failed = true;
		}
	}

	@After
	public void after() {
		System.out.println("End of unit test.");
		if (!failed)
			System.out.println("All tests successful");
		else
			System.out.println("One or more unit tests failed.");
	}

}
