package com.omer.Junit;

import static org.junit.Assert.assertArrayEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.omer.TwoSum.TwoSum;

public class UnitTests {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Starting tests.");
	}
	
	@Test
	public void testTwoSum() {
		TwoSum tester = new TwoSum();
		assertArrayEquals("Array [4,4,1,2,9,8] has two sum for target 8", new int[] {0,1},tester.twoSum(new int[] {4,4,1,2,9,8}, 8));
		assertArrayEquals("Array [4,4,0,1,0,9,8] has two sum for target 0", new int[] {2,4},tester.twoSum(new int[] {4,4,0,1,0,9,8}, 0));
	}

	@Test
	public void testTwoSumMap() {
		TwoSum tester = new TwoSum();
		assertArrayEquals("Array [4,4,1,2,9,8] has two sum for target 8", new int[] {0,1},tester.twoSumMap(new int[] {4,4,1,2,9,8}, 8));
		assertArrayEquals("Array [4,4,0,1,0,9,8] has two sum for target 0", new int[] {2,4},tester.twoSumMap(new int[] {4,4,0,1,0,9,8}, 0));
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("End of tests.");
	}
}
