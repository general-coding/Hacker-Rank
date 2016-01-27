package algorithms.implementation;

import java.util.Scanner;

public class SherlockAndSquares {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int low = in.nextInt();
			int high = in.nextInt();

			int count = (int) ((Math.floor(Math.sqrt(high)) - Math.ceil(Math.sqrt(low))) + 1);
			System.out.println(count);
		}
	}

}
