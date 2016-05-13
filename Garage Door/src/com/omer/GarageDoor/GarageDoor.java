package com.omer.GarageDoor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Problem from Reddit.com/DailyProgrammer
 * (https://www.reddit.com/r/dailyprogrammer/comments/4cb7eh/
 * 20160328_challenge_260_easy_garage_door_opener/) You just got a new garage
 * door installed by the Automata™ Garage Door Company. You are having a lot of
 * fun playing with the remote clicker, opening and closing the door, scaring
 * your pets and annoying the neighbors. The clicker is a one-button remote that
 * works like this: If the door is OPEN or CLOSED, clicking the button will
 * cause the door to move, until it completes the cycle of opening or closing.
 * Door: Closed -> Button clicked -> Door: Opening -> Cycle complete -> Door:
 * Open. If the door is currently opening or closing, clicking the button will
 * make the door stop where it is. When clicked again, the door will go the
 * opposite direction, until complete or the button is clicked again. We will
 * assume the initial state is CLOSED.
 * 
 * @author Omer
 *
 */
public class GarageDoor {

	// Define all the valid states of the Finite State Machine.
	public enum State {
		CLOSED /* 0 */, OPENING /* 1 */, OPEN /* 2 */, CLOSING /* 3 */, STOPPED_WHILE_CLOSING /* 4 */, STOPPED_WHILE_OPENING
		/* 5 */};

	// Define the valid transitions between states of the FSM.
	int[][] transition = { { 1, 0 }, { 5, 2 }, { 3, 2 }, { 4, 0 }, { 3, 4 }, { 1, 5 } };

	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		String line;
		State currentDoorState = State.CLOSED; // Current state of the door.

		try {
			bufferedReader = new BufferedReader(new FileReader("src//input.txt"));
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println("Door: " + currentDoorState);
				GarageDoor garageDoor = new GarageDoor();
				currentDoorState = garageDoor.next(currentDoorState, line);
				System.out.println("> " + (line.startsWith("b") ? "Button clicked" : "Cycle complete"));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This methods returns the next valid state on the execution of the event.
	 */
	public State next(State currentState, String event) {
		int cmd = event.startsWith("b") ? 0 : 1; // 0 if event is Button
													// clicked, 1 otherwise.
		return State.values()[transition[currentState.ordinal()][cmd]];
	}

}