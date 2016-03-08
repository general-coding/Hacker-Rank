package jv.collections;

import java.util.Scanner;

public class Java1DArrayHard {
	private static boolean result = false;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int m = in.nextInt();
			int[] A = new int[n];
			int temp = 0;

			boolean[] visitedArray = new boolean[n];

			for (int j = 0; j < n; j++) {
				visitedArray[j] = false;
				A[j] = in.nextInt();
			}

			result = false;

			isPossible(A, visitedArray, m, n, temp);

			if (result) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

		in.close();
	}

	private static void isPossible(int[] A, boolean[] visitedArray, int m, int n, int i) {
		if (i > n || i + m >= n || i == n - 1) {
			result = true;
			return;
		}
		if (visitedArray[i] == true) {
			return;
		}
		visitedArray[i] = true;
		if (i + 1 < n && A[i + 1] == 0) {
			isPossible(A, visitedArray, m, n, i + 1);
		}
		if (i - 1 >= 0 && A[i - 1] == 0) {
			isPossible(A, visitedArray, m, n, i - 1);
		}
		if (i + m < n && A[i + m] == 0) {
			isPossible(A, visitedArray, m, n, i + m);
		}
	}
}
