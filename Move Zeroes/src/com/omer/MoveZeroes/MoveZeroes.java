package com.omer.MoveZeroes;

import java.util.Arrays;

public class MoveZeroes {
	public static void main(String[] args) {
		MoveZeroes moveZeroes = new MoveZeroes();
		System.out.println(Arrays.toString(moveZeroes.moveZeroes(new int[] {0,1,2,4,0,0,0,3,0,0})));
	}

	public int[] moveZeroes(int nums[]) {
		int next;
		for (int i = 0; i < nums.length - 1;i++) {
			if (nums[i] == 0) {
				next = i + 1;
				while (nums[next] == 0 && next < nums.length-1) {
					next++;
				}
				nums[i] = nums[next];
				nums[next] = 0;
			}
		} 
		return nums;
	}
}
