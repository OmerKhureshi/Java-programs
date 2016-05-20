package com.omer.Permutation;

import java.util.Map;
import java.util.HashMap;

/**
 * Compute permutation recursively and find nth permutation of a string of concatenated consecutive natural numbers.
 * @author Syed Omer Salar Khureshi
 *
 */
public class Permutation {
	
	public Map<Integer, String> perms = new HashMap<Integer, String>();
	int counter = 0;
	public static void main(String[] args) {
		Permutation permutation = new Permutation();
//		permutation.permutation("0123");
//		System.out.println(permutation.perms);
		System.out.println(permutation.compute(3240, 7));
		reset(permutation);
		System.out.println(permutation.compute(240, 6));
	}
	
	/**
	 * Computes the nth permutation of a string comprising a concatenation of consecutive natural numbers <= numOfElements.
	 * @param num - non zero indexed nth permutation
	 * @param numOfElements
	 */
	public String compute(int num, int numOfElements) {
		String str = "";
		for (int i = 0; i < numOfElements; i++) {
			str += String.valueOf(i);
		}
		permutation(str);
		
		if (num >= perms.size() || num < 0 ) throw new IllegalArgumentException();
		return perms.get(num-1);
	}
	
	public void permutation(String str) {
		permutation("", str);
	}
	
	/**
	 * Computes all permutations of the specified string str and adds them to the perms hashMap.
	 * @param prefix
	 * @param str
	 */
	public void permutation(String prefix, String str) {
		int len = str.length();
		if(len == 0) {
			perms.put(counter++, prefix);
		}
		
		for (int i=0; i< len; i++) {
			permutation(prefix + str.charAt(i), str.substring(0,i) + str.substring(i+1, len));
		}
		
	}
	
	public static void reset(Permutation permutation) {
		permutation.perms.clear();
		permutation.counter = 0;
	}
	
	
	
}
