package com.omer.JUnit;

import com.omer.Permutation.Permutation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class UnitTests {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Starting tests.");
	}
	
	@Test
	public void testPermutation() {
		Permutation tester = new Permutation();
		Map<Integer, String> perms = new HashMap<Integer, String>();
		perms.put(0, "abc");
		perms.put(1, "acb");
		perms.put(2, "bac");
		perms.put(3, "bca");
		perms.put(4, "cab");
		perms.put(5, "cba");
		tester.permutation("abc");
		assertEquals("Checking all possible permutations of string \"abc\" ", perms, tester.perms);
	}
	
	@Test
	public void testCompute() {
		Permutation tester = new Permutation();
		assertEquals("3240th permutation of 7 is 4265310", "4265310", tester.compute(3240, 7));
		Permutation.reset(tester);
		assertEquals("240th permutation of 6 is 154320", "154320", tester.compute(240, 6));
	}
	
	@Test
	public void testIllegalArgumentException() {
		Permutation tester = new Permutation();
		Throwable e = null;
		try {
			assertEquals("3240th permutation of 7 is 4265310", "4265310", tester.compute(3240, 2));	
		} catch (IllegalArgumentException eLocal) {
			e = eLocal;
		} 
		assertTrue(e instanceof IllegalArgumentException);
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("End of tests.");
	}
}
