package com.omer.JUnit;

import com.omer.ReverseWord.ReverseWord;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UnitTests {
	static boolean failed = false;
	
	@Before
	public void before() {
		System.out.println("Starting unit tests.");
	}
	
	@Test
	public void testReverse() {
		ReverseWord tester = new ReverseWord();
		try {
			assertEquals("Reverse of Hello World is World Hello", "World Hello", tester.reverse("Hello World"));
			assertEquals("Reverse of    Hello    World   is World Hello", "World Hello", tester.reverse("   Hello    World   "));
			assertEquals("Reverse of Hel  lo World is World Hel lo", "World lo Hel", tester.reverse("Hel  lo World"));
		} catch(AssertionError e) {
			failed = true;
		}
	}
	
	@After
	public void after() {
		System.out.println("Finished unit tests.");
		if (!failed) System.out.println("Tests executed successfully");
		else System.out.println("There was an error.");
	}
}
