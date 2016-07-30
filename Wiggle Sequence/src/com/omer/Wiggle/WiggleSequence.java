package com.omer.Wiggle;

/**
 * This class demonstrates calculating the maximum length of a valid wiggle sequence.
 * Problem from: https://leetcode.com/problems/wiggle-subsequence/
 * Solution idea from: http://www.programcreek.com/2014/07/leetcode-wiggle-subsequence-java/
 * @author Syed Omer Salar Khureshi
 *
 */
public class WiggleSequence {

	public int wiggleMaxLength(int[] nums) {
		int count = 1;

		// Taking care of edge conditions.
		if (nums.length == 0)
			return 0;
		else if (nums.length < 2)
			return 1;

		for (int i = 0, j = 0; i < nums.length - 1; i = j, i++, j = i) {

			if (nums[i] > nums[i + 1]) {
				count++;
				while (j < nums.length - 2 && nums[j + 1] >= nums[j + 2]) {
					j++;
				}
			} else if (nums[i] < nums[i + 1]) {
				count++;
				while (j < nums.length - 2 && nums[j + 1] <= nums[j + 2]) {
					j++;
				}
			}
		}
		return count;
	}

}
