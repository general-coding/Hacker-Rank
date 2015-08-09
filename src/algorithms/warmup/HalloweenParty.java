package algorithms.warmup;

/*
 * Problem Statement
 * Halloween Party
 * https://www.hackerrank.com/challenges/halloween-party
 */

import java.util.Scanner;

public class HalloweenParty {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		long t = in.nextInt();

		if (1 <= t && t <= 10) {
			for (long i = 0; i < t; i++) {
				long k = in.nextInt();

				if (2 <= k && k <= 10000000) {
					long a = 0;
					long b = k;
					long product = a * b;
					while (a <= b) {
						if (product <= (a * b)) {
							product = a * b;
						}

						a++;
						b--;
					}

					System.out.println(product);
				}
			}
		}

		in.close();
	}

}
