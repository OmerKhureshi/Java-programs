package com.omer.JUnit;

import org.junit.Before;
import org.junit.AfterClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import com.omer.AddTwoNumbers.AddTwoNumbers;
import com.omer.AddTwoNumbers.ListNode;

public class UnitTest {

	static Boolean failed = false;
	
	@Before
	public void before() {
		System.out.println("Before tests");
	}

	/**
	 * Test to check if two list nodes of same length correctly.
	 */
	@Test
	public void testAddTwoNumbers() {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(3);
		l1.next.next = new ListNode(5);

		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(4);
		l2.next.next = new ListNode(6);

		ListNode l3 = new ListNode(3);
		l3.next = new ListNode(7);
		l3.next.next = new ListNode(1);
		l3.next.next.next = new ListNode(1);

		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
		ListNode l4 = addTwoNumbers.addTwoNumbers(l1, l2);
		ListNode l3tmp = l3;
		ListNode l4tmp = l4;

		while (l3tmp != null) {
			try {
				assertEquals(l3tmp.val, l4tmp.val);
			} catch (AssertionError e) {
				failed = true;
				System.out.println("here");
			}
			l3tmp = l3tmp.next;
			l4tmp = l4tmp.next;
		}
	}
	
	/**
	 * Test to check if two list nodes of different length correctly.
	 */	
	@Test
	public void testAddTwoNumbersLengthMismatch() {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(3);
		l1.next.next = new ListNode(5);
		
		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(4);
		l2.next.next = new ListNode(6);
		l2.next.next.next = new ListNode(8);
		
		ListNode l3 = new ListNode(3);
		l3.next = new ListNode(7);
		l3.next.next = new ListNode(1);
		l3.next.next.next = new ListNode(9);
		
		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
		ListNode l4 = addTwoNumbers.addTwoNumbers(l1, l2);
		ListNode l3tmp = l3;
		ListNode l4tmp = l4;
		
		while (l3tmp != null) {
			try {
				assertEquals(l3tmp.val, l4tmp.val);
			} catch (AssertionError e) {
				failed = true;
				System.out.println("here");
			}
			l3tmp = l3tmp.next;
			l4tmp = l4tmp.next;
		}
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("\nAfter tests.");
		if (failed == false) System.out.println("\n** All tests executed successfully! **");
	}
}
