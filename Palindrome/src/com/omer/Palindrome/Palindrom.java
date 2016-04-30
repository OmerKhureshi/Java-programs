package com.omer.Palindrome;
import java.lang.reflect.Array;

public class Palindrom{

	public static void main(String[] args) {
		Palindrom helloWorld = new Palindrom();
		System.out.println(helloWorld.isPalindrome(2));
		System.out.println(helloWorld.isPalindromeWithoutExtraSpace(1233321));
	}
	
    public boolean isPalindrome(int x) {
    	if (x < 0) return false;
    	else if (x == 0) return true;
        char[] number = String.valueOf(x).toCharArray();
        int len = Array.getLength(number);
        for(int i=0; i<=len/2; i++) {
            if (number[i] != number[len-1-i]) 
            	return false;
        }
        return true;
    }
    
    public boolean isPalindromeWithoutExtraSpace(int x) {
    	int pow = (int) (Math.log10(x));
    	int len = (int) Math.pow(10, pow);
    	int rem = 10;
    	if (x < 0) return false;
    	else if (x == 0 ) return true;
    	while (x > 0) {
    		//Compare left most and right most digits. x = 1221
        	if (x/len != x%rem) 
        		return false;
        	x = (x % len) /10;
        	len /= 100;    		
    	}
    	return true;
    }
}
