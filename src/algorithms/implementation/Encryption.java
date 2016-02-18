package algorithms.implementation;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String input = in.nextLine();

		int height = (int) Math.ceil(Math.sqrt(input.length()));
//		int width = (int) Math.floor(Math.sqrt(input.length()));

		StringBuilder result = new StringBuilder();
		for (int i = 0; i < height; i++) {
			int j = i;
			while (j < input.length()) {
				result.append(input.charAt(j));
				j += height;
			}
			result.append(' ');
		}
		System.out.println(result);
		in.close();
	}
}
