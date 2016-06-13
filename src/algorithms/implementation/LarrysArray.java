package algorithms.implementation;

import java.util.Scanner;

public class LarrysArray {
	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		int testCase = in.nextInt();
		while (testCase-- > 0) {
			final int n = in.nextInt();
			final int[] a = new int[n];
			for (int i = 0; i < n; ++i) {
				a[i] = in.nextInt();
			}
			final int n_dec3 = n - 3;
			for (int i = 0; i <= n_dec3; ++i) {
				for (int j = n_dec3; j >= i; --j) {
					final int x = a[j];
					final int y = a[j + 1];
					final int z = a[j + 2];
					if (z <= y && z <= x) {
						a[j] = z;
						a[j + 1] = x;
						a[j + 2] = y;
					} else if (y <= x && y <= z) {
						a[j] = y;
						a[j + 1] = z;
						a[j + 2] = x;
					} else {
						// don't need to rotate
					}
				}
			}
			System.out.println(a[n - 2] <= a[n - 1] ? "YES" : "NO");
		}

		in.close();
	}
}
