package datastructures.arrays;

import java.util.Scanner;

public class ArraysDS {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			a[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		in.close();
	}

}
