package com.omer.JUnit;

import com.omer.HouseRobbers.HouseRobber;

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
		HouseRobber tester = new HouseRobber();
		try {
			assertEquals("Maximum sum in [1,2,3] is 4", 4, tester.rob(new int[] { 1, 2, 3 }));
			assertEquals("Maximum sum in [] is 0", 0, tester.rob(new int[] {}));
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
