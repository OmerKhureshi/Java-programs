package com.omer.SingleNumber;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Syed Omer Salar Khureshi
 *
 */
public class SingleNumber {

	public static void main(String[] args) {

		SingleNumber singleNumber = new SingleNumber();
		System.out.println(singleNumber.findUniqueNumberXOR(new int[] { 5, 2, 5, 1, 1, 3, 3, 2 }));
		System.out.println(singleNumber.findUniqueNumberHashSet(new int[] { 5, 2, 5, 1, 1, 3, 3, 2,10}));
	}

	/**
	 * This method uses XOR to find the unique number. 0^0 = 0; 1^1 = 0; 1^0 =
	 * 1; 0^1 = 1;
	 * 
	 * @param nums
	 *            input array of numbers
	 * @return the unique number
	 */
	public int findUniqueNumberXOR(int[] nums) {
		int res = 0;
		for (int i : nums) {
			res = res ^ i;
		}
		return res;
	}

	/**
	 * This method uses HashSet to check if an element is already present in
	 * HashSet. If not, that element is added, else it is removed. The last
	 * remaining number is the unique number.
	 * 
	 * @param nums
	 *            input array of numbers
	 * @return the unique number
	 */
	public int findUniqueNumberHashSet(int[] nums) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for (int i : nums) {
			if (!hashSet.add(i))
				hashSet.remove(i);
		}

		Iterator<Integer> iterator = hashSet.iterator();
		return iterator.next();
	}

}
