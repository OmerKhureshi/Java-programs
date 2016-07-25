package com.omer.HouseRobbers;

/**
 * This class demonstrates the solution for the LeetCode problem:
 * https://leetcode.com/problems/house-robber/ You are a professional robber
 * planning to rob houses along a street. Each house has a certain amount of
 * money stashed, the only constraint stopping you from robbing each of them is
 * that adjacent houses have security system connected and it will automatically
 * contact the police if two adjacent houses were broken into on the same night.
 * 
 * Given a list of non-negative integers representing the amount of money of
 * each house, determine the maximum amount of money you can rob tonight without
 * alerting the police.
 * 
 * Solution references:
 * http://www.programcreek.com/2014/03/leetcode-house-robber-java/
 * 
 * @author Syed Omer Salar Khureshi
 *
 */
public class HouseRobber {

	public static void main(String[] args) {
		HouseRobber houseRobber = new HouseRobber();
		System.out.println(houseRobber.rob(new int[] { 1, 2, 3 }));
	}

	/**
	 * This method computes the max sum with the problem constraints. The last
	 * element of maxSum array always contains the maximum valid sum.
	 * 
	 * @param nums
	 *            input array
	 * @return max sum
	 */
	public int rob(int[] nums) {
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		int[] maxSum = new int[nums.length];
		maxSum[0] = nums[0];
		maxSum[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < nums.length; i++) {
			maxSum[i] = Math.max(maxSum[i - 1], maxSum[i - 2] + nums[i]);
		}

		return maxSum[maxSum.length - 1];

	}
}