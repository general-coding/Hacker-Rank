package algorithms.implementation;

import java.util.Scanner;

public class TaumAndBirthday {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int b = in.nextInt();
			int w = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			int z = in.nextInt();

			// int minb = Math.min(b*x, b*(y+z));
			// int minw = Math.min(w*(x+z), w*y);
			// System.out.printlnn(minb + minw);

			int costofb = b * x;
			int costofw = w * y;
			if (x == y) {
				System.out.println(costofb + costofw);
			} else if (x < y) {
				if ((x + z) < y) {
					System.out.println(((w * x) + (w * z)) + costofb);
				} else {
					System.out.println(costofb + costofw);
				}
			} else {
				if ((y + z) < x) {
					System.out.println(((b * y) + (b * z)) + costofw);
				} else {
					System.out.println(costofb + costofw);
				}
			}
		}

		in.close();
	}

}
