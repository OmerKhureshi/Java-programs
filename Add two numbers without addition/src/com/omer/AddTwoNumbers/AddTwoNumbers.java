package com.omer.AddTwoNumbers;

/**
 * LeetCode problem: https://leetcode.com/problems/sum-of-two-integers/
 * 
 * This class demonstrates addition of two integers without using addition or
 * subtraction operator. This is achieved using bit operators XOR and AND.
 * 
 * @author Syed Omer Salar Khureshi
 *
 */
public class AddTwoNumbers {

	public static void main(String[] args) {
		AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
		System.out.println(addTwoNumbers.add(-1, -4));
	}

	/**
	 * This method performs the addition on two input parameters using bit
	 * operators using XOR and AND.
	 * 
	 * @param x
	 *            first integer
	 * @param y
	 *            second integer
	 * @return sum of two numbers.
	 */
	public int add(int x, int y) {
		
		while (y != 0) {
			int sum = x ^ y;
			int carry = (x & y) << 1;
			x = sum;
			y = carry;
		}

		return x;
	}
}
