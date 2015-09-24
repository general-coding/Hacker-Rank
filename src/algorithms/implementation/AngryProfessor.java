package algorithms.implementation;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		if (t >= 1 && t <= 10) {

			for (int i = 0; i < t; i++) {
				int count = 0;
				int n = in.nextInt();
				if (n >= 1 && n <= 1000) {
					int k = in.nextInt();
					if (k >= 1 && k <= n) {
						for (int j = 0; j < n; j++) {
							int a = in.nextInt();

							if (a <= 0) {
								count++;
							}
						}
						if (count < k) {
							System.out.println("YES");
						} else {
							System.out.println("NO");
						}
					}
				}
			}
		}

		in.close();
	}
}