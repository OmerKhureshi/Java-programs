package com.omer.junit;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.omer.GarageDoor.GarageDoor;
import com.omer.GarageDoor.GarageDoor.State;

public class UnitTests {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Starting tests.");
	}
	
	@Test
	public void testNext() {
		GarageDoor tester = new GarageDoor();
		assertEquals("On button click state changes from CLOSED TO OPENING ", State.OPENING, tester.next(State.CLOSED, "button_clicked"));
		assertEquals("On button click state changes from OPENING TO STOPPED_WHILE_OPENING ", State.STOPPED_WHILE_OPENING, tester.next(State.OPENING, "button_clicked"));
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("End of tests.");
	}
}
