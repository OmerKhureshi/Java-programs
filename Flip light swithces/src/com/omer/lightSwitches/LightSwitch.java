package com.omer.lightSwitches;

import java.util.BitSet;
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

public class LightSwitch {

	public static void main(String[] args) {
		
		try {

			File file = new File("src//input.txt");
			Scanner in = new Scanner(file);
			int size = in.nextInt();	
			BitSet switches = new BitSet(size);
						
			while(in.hasNextInt()) {
				int[] range = {in.nextInt(), in.nextInt()};
				Arrays.sort(range);
				switches.flip(range[0], range[1]+1);
			}

	        System.out.println(switches.cardinality());
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

