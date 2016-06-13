package com.omer.AddTwoNumbers;

/**
 * You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 * 
 * link: https://leetcode.com/problems/add-two-numbers/
 * 
 * @author Syed Omer Salar Khureshi
 *
 */
public class AddTwoNumbers {

	public static void main(String[] args) {
		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(3);
		l1.next.next = new ListNode(5);

		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(4);
		l2.next.next = new ListNode(6);
		l2.next.next.next = new ListNode(8);

		addTwoNumbers.addTwoNumbers(l1, l2);
	}

	/**
	 * Definition for singly-linked list. public class ListNode { int val;
	 * ListNode next; ListNode(int x) { val = x; } }
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode l1tmp = l1;
		ListNode l2tmp = l2;
		ListNode l3 = new ListNode(0);
		ListNode l3tmp = l3;

		while (l1tmp != null || l2tmp != null) {
			int val = (l1tmp != null ? l1tmp.val : 0) + (l2tmp != null ? l2tmp.val : 0) + carry;
			carry = val / 10;
			val = val % 10;
			l3.next = new ListNode(val);
			if (l1tmp != null)
				l1tmp = l1tmp.next;
			if (l2tmp != null)
				l2tmp = l2tmp.next;
			l3 = l3.next;
		}

		if (carry != 0) {
			l3.next = new ListNode(carry);
		}
		//
		// System.out.println("1 " + l3tmp.next.val);
		// System.out.println("2 " + l3tmp.next.next.val);
		// System.out.println("3 " + l3tmp.next.next.next.val);
		// System.out.println("3 " + l3tmp.next.next.next.next.val);

		return l3tmp.next;
	}
}
