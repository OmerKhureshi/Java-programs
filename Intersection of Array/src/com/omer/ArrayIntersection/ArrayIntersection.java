package com.omer.ArrayIntersection;

import java.util.HashMap;
import java.util.ArrayList;

public class ArrayIntersection {

	public int[] getIntersectingElements(int[] nums1, int[] nums2) {
		int[] bigArray;
		int[] smallArray;
		HashMap<Integer, Integer> common = new HashMap<>();
		ArrayList<Integer> result = new ArrayList<>();

		if (nums1.length > nums2.length) {
			bigArray = nums1;
			smallArray = nums2;
		} else {
			bigArray = nums2;
			smallArray = nums1;
		}

		for (int i = 0; i < bigArray.length; i++) {
			if (!common.containsKey(bigArray[i])) {
				common.put(bigArray[i], 0);
			}
		}
		for (int i = 0; i < smallArray.length; i++) {
			if (common.containsKey(smallArray[i]) && !result.contains(smallArray[i])) {
				result.add(smallArray[i]);
			}
		}

		int[] intersection = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			intersection[i] = result.get(i);
		}

		return intersection;
	}
}