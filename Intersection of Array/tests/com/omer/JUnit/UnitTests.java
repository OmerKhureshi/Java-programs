package com.omer.JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.omer.ArrayIntersection.*;

public class UnitTests {
	static Boolean failed = false;
	
	@Before
	public void before() {
		System.out.println("Start of unit tests.");
	}
	
	@Test
	public void testAdd() {
		ArrayIntersection tester = new ArrayIntersection();
		try {
			assertArrayEquals("Common elements in [1,2,2,1] and [2,2] are [2]", new int[]{2}, tester.getIntersectingElements(new int[]{1, 2, 2, 2}, new int[]{2,2}));
			assertArrayEquals("Common elements in [1,2,2,1] and [3,4,5] are []", new int[]{}, tester.getIntersectingElements(new int[]{1, 2, 2, 2}, new int[]{3,4,5}));
			assertArrayEquals("Common elements in [1,1,1,1,1,0,0,0] and [1,1,1,1,1,0,0,0] are [1,0]", new int[]{1,0}, tester.getIntersectingElements(new int[]{1,1,1,1,1,0,0,0}, new int[]{1,1,1,1,1,0,0,0}));
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
