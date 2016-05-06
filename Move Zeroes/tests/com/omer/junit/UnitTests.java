package com.omer.junit;


import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.omer.MoveZeroes.MoveZeroes;

public class UnitTests {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Starting tests.");
	}
	
	@Test
	public void testMoveZeroes() {
		MoveZeroes tester = new MoveZeroes();
		assertArrayEquals(new int[] {0}, tester.moveZeroes(new int[] {0}));
		assertArrayEquals(new int[] {0, 1, 2}, tester.moveZeroes(new int[] {1, 2, 0}));
		assertArrayEquals(new int[] {0, 0, 1, 0, 0, 2, 0, 3}, tester.moveZeroes(new int[] {1,2,3,0,0,0,0,0}));
		assertArrayEquals(new int[] {0, -1}, tester.moveZeroes(new int[] {-1,0}));

	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("End of tests. All tests successful.");
	}
	
	
}
