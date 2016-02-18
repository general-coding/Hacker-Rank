package algorithms.implementation;

import java.util.Scanner;

public class ModifiedKaprekarNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		long low = in.nextInt();
		long high = in.nextInt();
		boolean flag = false;

		for (long i = low; i <= high; i++) {
			String square = (long) Math.pow(i, 2) + " ";
			square = square.trim();

			if (square.length() == 1) {
				if (Integer.parseInt(square) == 1) {
					System.out.print(square + " ");
				}
			} else if (square.length() % 2 == 0) {
				int digit = (int) square.length() / 2;
				long left = Integer.parseInt(square.substring(0, digit));
				long right = Integer.parseInt(square.substring(digit, 2 * digit));
				if (i == (left + right)) {
					System.out.print(i + " ");
					flag = true;
				}
				continue;
			} else {
				int digit = square.length() / 2;
				long left = Integer.parseInt(square.substring(0, digit));
				long right = Integer.parseInt(square.substring(digit, 2 * digit + 1));
				if (i == (left + right)) {
					System.out.print(i + " ");
					flag = true;
				}
			}
		}
		if (!flag) {
			System.out.println("INVALID RANGE");
		}

		in.close();
	}
}
