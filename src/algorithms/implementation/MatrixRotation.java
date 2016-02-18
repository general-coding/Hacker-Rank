package algorithms.implementation;

import java.util.Scanner;

public class MatrixRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int m = in.nextInt();
		int n = in.nextInt();
		int r = in.nextInt();

		int a[][] = new int[m][n];

		if (Math.min(m, n) % 2 == 0) {
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = in.nextInt();
				}
			}
			for (int i = 0; i < r; i++) {

			}
		}

		in.close();
	}

}
