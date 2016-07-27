package com.omer.ReverseWord;

public class ReverseWord {
	
	public static void main(String[] args) {
		ReverseWord reverseWord = new ReverseWord();
		System.out.println(reverseWord.reverse("   World      Hello   "));
	}
	
	public String reverse(String inWord) {
        String[] words = inWord.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1; i > 0; i--) {
            sb.append(words[i].trim());
            sb.append(" ");
        }
        sb.append(words[0]);
        String revStr = sb.toString();
        return revStr;
	}
	
}
