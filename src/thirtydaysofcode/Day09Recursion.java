package thirtydaysofcode;

import java.util.Scanner;

public class Day09Recursion {

	static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}

		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		System.out.println(factorial(n));

		in.close();
	}

}
