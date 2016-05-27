package com.omer.JUnit;

import com.omer.CaesarCipher.CaesarCipher;

import org.junit.BeforeClass;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass; 
import org.junit.Test;

public class UnitTests {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Starting tests.");
	}

	@Test
	public void testEncryptToCaesar() {
		CaesarCipher tester = new CaesarCipher();
		tester.init();
		assertEquals("Encrypt \"ABCDEF\" to \"BCDEFG\" with a shift of 1", tester.encryptToCaesar(1, "ABCDEF"), "BCDEFG");
		assertEquals("Encrypt \"abcdef\" to \"defghi\" with a shift of 3", tester.encryptToCaesar(3, "abcdef"), "defghi");
		assertEquals("Encrypt \"A BCDEF\" to \"B CDEFG\" with a shift of 1", tester.encryptToCaesar(1, "A BCDEF"), "B CDEFG");
		assertEquals("Encrypt \"abcde f\" to \"defgh i\" with a shift of 3", tester.encryptToCaesar(3, "abcde f"), "defgh i");
		assertEquals("Encrypt \"A BCDef\" to \"B CDEfg\" with a shift of 1", tester.encryptToCaesar(1, "A BCDef"), "B CDEfg");
	}

	@Test
	public void testDecryptFromCaesar() {
		CaesarCipher tester = new CaesarCipher();
		tester.init();
		assertEquals("Encrypt \"BCDEFG\" to \"ABCDEF\" with a shift of 1", tester.decryptFromCaesar("BCDEFG", 1), "ABCDEF");
		assertEquals("Encrypt \"defghi\" to \"abcdef\" with a shift of 3", tester.decryptFromCaesar("defghi", 3), "abcdef");
		assertEquals("Encrypt \"B CDEFG\" to \"A BCDEF\" with a shift of 1", tester.decryptFromCaesar("B CDEFG", 1), "A BCDEF");
		assertEquals("Encrypt \"defgh i\" to \"abcde f\" with a shift of 3", tester.decryptFromCaesar("defgh i", 3), "abcde f");
		assertEquals("Encrypt \"B CDEfg\" to \"A BCDef\" with a shift of 1", tester.decryptFromCaesar("B CDEfg", 1), "A BCDef");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("End of tests.");
	}

}
