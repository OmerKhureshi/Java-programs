package com.omer.CaesarCipher;

import java.util.Map;
import java.util.HashMap;

/**
 * This java program encrypts a given string using CaesarCipher and user
 * specified shift factor. The program does not encrypt non alphabetic
 * characters but retains them as they are in the output. Case of the string is maintained.
 * 
 * @author Syed Omer Salar Khureshi
 *
 */
public class CaesarCipher {

	public Map<Character, Integer> alphabetUpper = new HashMap<Character, Integer>();
	public Map<Character, Integer> alphabetLower = new HashMap<Character, Integer>();

	public static void main(String[] args) {
		CaesarCipher cc = new CaesarCipher();
		cc.init();
		int shiftFactor = 1;
		String res = cc.encryptToCaesar(shiftFactor, "abcdef");
		System.out.println("encrypted string: " + res);
		System.out.println("decrypted string: " + cc.decryptFromCaesar(res, shiftFactor));

	}

	public void init() {
		// Create new HashMap to store indexes of characters in English
		// alphabet.
		alphabetUpper = new HashMap<Character, Integer>();

		// Store indexes of upper case characters
		for (int i = 0; i < 26; i++) {
			alphabetUpper.put((char) (i + 65), i);
		}

		// Store indexes of lower case characters
		for (int i = 0; i < 26; i++) {
			alphabetLower.put((char) (i + 97), i);
		}
	}

	public String encryptToCaesar(int shift, String string) {

		// Character array to store the encrypted string
		char[] encryptedCharArray = new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			int index;
			char enChar;
			// Get character at ith position from string
			char ch = string.charAt(i);

			// Donot shift if character is non alphabetic.
			if (!Character.isAlphabetic(ch)) {
				encryptedCharArray[i] = string.charAt(i);
				continue;
			}
			if (Character.isUpperCase(ch)) {
				// Get index of the upper case character
				index = alphabetUpper.get(ch);
				// Shift the index
				index = (index + shift) % 26;
				// Get the encrypted character
				enChar = (char) (index + 65);
			} else {
				// Get index of the lower case character
				index = alphabetLower.get(ch);
				// Shift the index
				index = (index + shift) % 26;
				// Get the encrypted character
				enChar = (char) (index + 97);
			}

			// Insert encrypted character into encryptedCharArray
			encryptedCharArray[i] = enChar;
		}

		return String.valueOf(encryptedCharArray);
	}

	public String decryptFromCaesar(String str, int unshift) {

		char[] decryptedCharArray = new char[str.length()];
		int index;
		char deChar;

		for (int i = 0; i < str.length(); i++) {

			// Get each character
			char ch = str.charAt(i);

			// Ignore if character is non alphabetic
			if (!Character.isAlphabetic(ch)) {
				decryptedCharArray[i] = ch;
				continue;
			}

			if (Character.isUpperCase(ch)) {
				// Get index of the character
				index = alphabetUpper.get(ch);

				// Un-shift the index.
				index = ((index - unshift) + 26) % 26;

				// Get the decrypted character.
				deChar = (char) (index + 65);
			} else {
				// Get index of the character
				index = alphabetLower.get(ch);

				// Un-shift the index.
				index = ((index - unshift) + 26) % 26;

				// Get the decrypted character.
				deChar = (char) (index + 97);
			}

			// Insert decrypted character into decryptedCharArray.
			decryptedCharArray[i] = deChar;
		}
		return String.valueOf(decryptedCharArray);
	}

}