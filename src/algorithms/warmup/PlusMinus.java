package algorithms.warmup;

import java.util.Scanner;

/*
 * Problem Statement
 * Plus Minus
 * https://www.hackerrank.com/challenges/plus-minus 
 */

public class PlusMinus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		float n = in.nextFloat();
		float frac_pos = 0;
		float frac_neg = 0;
		float frac_zero = 0;

		for (int i = 0; i < n; i++) {
			float num = in.nextFloat();

			if (num > 0) {
				frac_pos++;
			} else if (num < 0) {
				frac_neg++;
			} else if (num == 0) {
				frac_zero++;
			}
		}

		System.out.printf("%.3f \n", frac_pos / n);
		System.out.printf("%.3f \n", frac_neg / n);
		System.out.printf("%.3f", frac_zero / n);
		
		in.close();
	}

}
