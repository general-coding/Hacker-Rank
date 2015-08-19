package algorithms.implementation;

import java.util.Scanner;

/*
 * Problem Statement
 * Sherlock and The Beast
 * https://www.hackerrank.com/challenges/sherlock-and-the-beast 
 */

public class SherlockAndTheBeast {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int n = in.nextInt();

			String s = "";

			for (int j = n; j >= 0; j--) {
				if (j % 3 == 0 && (n - j) % 5 == 0) {
					StringBuilder str = new StringBuilder();

					for (int k = 0; k < j; k++) {
						str.append("5");
					}

					for (int k = 0; k < (n - j); k++) {
						str.append("3");
					}

					s = str.toString();

					break;
				}
			}

			if (s == "") {
				System.out.println("-1");
			} else {
				System.out.println(s);
			}
		}

		in.close();
	}

}
