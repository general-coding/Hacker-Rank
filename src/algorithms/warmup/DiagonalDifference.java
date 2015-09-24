package algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int first_d = 0;
		int second_d = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int input = in.nextInt();
				// System.out.println(input);
				if (i == j) {
					first_d = first_d + input;
				}
				if((n-1-i) == j){
					second_d = second_d + input;
				}
			}
		}

//		System.out.println(first_d);
//		System.out.println(second_d);
		System.out.println(Math.abs(second_d - first_d));

		in.close();
	}

}
