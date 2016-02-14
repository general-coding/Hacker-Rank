package algorithms.implementation;

import java.util.Scanner;

public class TheGridSearch {
	static void search(String G[], String P[], int r) {
		int true_count = 0;
		int k = 0;
		int index = 0;
		int p_index[] = new int[r];
		for (int i = 0; i < p_index.length; i++) {
			p_index[i] = 99;
		}
		for (int i = 0; i < G.length; i++) {
			if (k < r) {
				if (G[i].contains(P[k])) {
					p_index[index] = G[i].indexOf(P[k]);
					k++;
					index++;
				}
			}
		}

		int i = 0;
		for (i = 0; i < p_index.length - 1; i++) {
			try {
				if (p_index[i] == p_index[i + 1]) {
					true_count++;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}

		if (p_index[i] == p_index[0]) {
			true_count++;
		}

		if (true_count == r) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int R = in.nextInt();
			int C = in.nextInt();
			C = C++;

			String G[] = new String[R];
			for (int G_i = 0; G_i < R; G_i++) {
				G[G_i] = in.next();
			}

			int r = in.nextInt();
			int c = in.nextInt();
			c = c++;
			String P[] = new String[r];
			for (int P_i = 0; P_i < r; P_i++) {
				P[P_i] = in.next();
			}

			search(G, P, r);
		}

		in.close();
	}

}
