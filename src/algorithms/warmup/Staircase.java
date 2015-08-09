package algorithms.warmup;

import java.util.Scanner;

/*
 * Problem Statement
 * Staircase
 * https://www.hackerrank.com/challenges/staircase
 */

public class Staircase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j >= n - 1) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		in.close();
	}

}
