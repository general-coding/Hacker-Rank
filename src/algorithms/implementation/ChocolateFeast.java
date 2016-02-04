package algorithms.implementation;

import java.util.Scanner;

public class ChocolateFeast {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();

			int w = n / c;
			int e = n / c;
			while (w >= m) {
				int eaten = w / m;
				e = e + eaten;
				w = w % m;
				w = w + eaten;
			}
			System.out.println(e);
		}
		in.close();
	}
}
