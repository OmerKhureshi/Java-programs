package com.omer.ReverseString;

public class ReverseString {
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		System.out.println(reverseString.reverse("hello"));
	}
	
	public String reverse(String s) {
		return new StringBuilder(s).reverse().toString();
	}
}
