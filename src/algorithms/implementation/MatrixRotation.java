package algorithms.implementation;

import java.util.Scanner;

public class MatrixRotation {

	public static void printTab(int[][] tab, int M, int N) {
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(tab[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void Rotate(int[][] tab, int M, int N, int R) {
		int max = Math.max(M, N);
		int min = Math.min(M, N);
		int loop = min / 2;

		for (int layer = 0; layer < loop; layer++) {

			int rot = 2 * max + 2 * (min - 2);
			rot = R % rot;

			for (int k = 0; k < rot; k++) {

				int temp = tab[layer][layer];

				for (int i = layer; i < M - 1 - layer; i++) {
					int temp2 = tab[i + 1][layer];
					tab[i + 1][layer] = temp;
					temp = temp2;
				}
				for (int j = layer; j < N - 1 - layer; j++) {
					int temp2 = tab[M - 1 - layer][j + 1];
					tab[M - 1 - layer][j + 1] = temp;
					temp = temp2;
				}
				for (int i = M - 1 - layer; i > layer; i--) {
					int temp2 = tab[i - 1][N - 1 - layer];
					tab[i - 1][N - 1 - layer] = temp;
					temp = temp2;
				}
				for (int j = N - 1 - layer; j > layer; j--) {
					int temp2 = tab[layer][j - 1];
					tab[layer][j - 1] = temp;
					temp = temp2;
				}
			}

			max -= 2;
			min -= 2;
		}
	}

	public static void main(String[] args) {
		Scanner in = null;
		try {
			in = new Scanner(System.in);

			int M = in.nextInt();
			int N = in.nextInt();
			int R = in.nextInt();

			int t_initial[][] = new int[M][N];

			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					t_initial[i][j] = in.nextInt();
				}
			}

			Rotate(t_initial, M, N, R);

			printTab(t_initial, M, N);

		} catch (Exception e) {
			e.printStackTrace();
		}

		in.close();
	}

}
