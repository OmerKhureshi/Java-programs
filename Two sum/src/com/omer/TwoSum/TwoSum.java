package com.omer.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = new TwoSum().twoSum(new int[] { 0, 4, 3, 0 }, 0);
		System.out.println(nums[0] + " : " + nums[1]);

		int[] nums2 = new TwoSum().twoSumMap(new int[] {4,4,1,2,9,8}, 8);
		System.out.println(nums2[0] + " : " + nums2[1]);
	}

	public int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			int a = (target - nums[i]);
			for (int j = 0; j < nums.length; j++) {
				if (a == nums[j] && j != i)
					return new int[] { i, j };
			}
		}
		return null;
	}
	
	public int[] twoSumMap(int[] nums, int target) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int comp = target - nums[i];
			if(map.containsKey(comp) && map.get(comp) != i) {
				return new int[] {map.get(comp), i};
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum found");
	}
}
