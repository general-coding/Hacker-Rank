package algorithms.strings;

import java.util.Scanner;

/*
 * Problem Statement
 * Funny String
 * https://www.hackerrank.com/challenges/funny-string 
 */

public class FunnyString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			String s = in.next();

			int j = 0;
			int l = s.length();
			boolean f = true;

			while (j < l / 2) {
				int lhs = Math.abs(s.charAt(j) - s.charAt(j + 1));
				int rhs = Math.abs(s.charAt(l - j - 1) - s.charAt(l - j - 2));
				if (lhs != rhs) {
					System.out.println("Not Funny");
					f = false;
					break;
				}

				j = j + 1;
			}

			if (f) {
				System.out.println("Funny");
			}
		}

		in.close();
	}

}
