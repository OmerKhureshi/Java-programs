package com.omer.FlipGame;

import java.util.Arrays;
import java.util.Vector;

public class FlipGame {

	public static void main(String[] args) {
		FlipGame flipGame = new FlipGame();
		System.out.println(flipGame.flip("++--++-++"));
	}

	public Vector<String> flip(String str) {
		Vector<String> results = new Vector<String>();
		if (str == null || str.isEmpty()) {
			return results;
		}
		;
		String[] src = str.split("");
		for (int i = 0; i <= src.length - 2; i++) {
			if (src[i].equals("+") && src[i + 1].equals("+")) {
				String str1 = join(Arrays.copyOfRange(src, 0, i), "");
				String str2 = join(Arrays.copyOfRange(src, i + 2, src.length), "");
				String res = str1 + "--" + str2;
				results.add(res);
				// System.out.println(res);
			}
		}
		return results;
	}

	/**
	 * This method converts from a String array to a String. It also provides an
	 * option to specify a String to be used in between the elements of the
	 * String array while joining
	 * 
	 * @param str
	 *            input String array
	 *
	 * @param glue
	 * @return the joined String
	 */
	public String join(String[] str, String glue) {

		if (str.length == 0)
			return "";
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i <= str.length - 2; i++) {
			builder.append(str[i]).append(glue);
		}

		builder.append(str[str.length - 1]);
		return builder.toString();
	}

}
