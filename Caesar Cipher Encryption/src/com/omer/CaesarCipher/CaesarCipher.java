package com.omer.CaesarCipher;

/**
 * This java program encrypts a given string using CaesarCipher and user
 * specified shift factor. The program does not encrypt non alphabetic
 * characters but retains them as they are in the output. Case of the string is
 * maintained.
 * 
 * @author Syed Omer Salar Khureshi
 *
 */
public class CaesarCipher {

	public static void main(String[] args) {
		CaesarCipher cc = new CaesarCipher();
		int shiftFactor = 1;
		String res = cc.encryptToCaesar(shiftFactor, "abc def");
		System.out.println("encrypted string: " + res);
		System.out.println("decrypted string: " + cc.decryptFromCaesar(res, shiftFactor));

	}

	/**
	 * Encrypts the string.
	 * @param shift - specifies the positions by which the characters should be shifted.
	 * @param string - the string to be encrypted.
	 * @return Encrypted string
	 */
	public String encryptToCaesar(int shift, String string) {
		char[] encryptedCharArray2 = new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			if (!Character.isAlphabetic(string.charAt(i))) {
				encryptedCharArray2[i] = string.charAt(i);
				continue;
			}
			encryptedCharArray2[i] = (char) (string.charAt(i) + shift);
		}
		return String.valueOf(encryptedCharArray2);
	}

	/**
	 * Decrypts the string.
	 * @param str - the string to be decrypted.
	 * @param unshift - specifies the positions by which the characters should be shifted backwards.
	 * @return Decrypted string
	 */
	public String decryptFromCaesar(String str, int unshift) {
		char[] decryptedCharArray = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isAlphabetic(str.charAt(i))) {
				decryptedCharArray[i] = str.charAt(i);
				continue;
			}
			decryptedCharArray[i] = (char) (str.charAt(i) - unshift);
		}
		return String.valueOf(decryptedCharArray);
	}

}