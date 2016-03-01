package jv.introduction;

import java.util.Scanner;

public class JavaLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int n = sc.nextInt();
			int sum = 0;
			sum = sum + a;

			for (int j = 0; j < n; j++) {
				sum = (int) (sum + Math.pow(2, j) * b);
				System.out.print(sum + " ");
			}

			System.out.println();
		}

		sc.close();
	}

}
