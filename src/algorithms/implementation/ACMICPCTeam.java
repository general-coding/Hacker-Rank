package algorithms.implementation;

import java.util.Scanner;

public class ACMICPCTeam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		int topic[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			char a[] = in.next().toCharArray();
			for (int j = 0; j < m; j++) {
				topic[i][j] = Integer.parseInt((a[j] + " ").trim());
			}
		}

		int teams = 0;
		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				int count = 0;
				for (int k = 0; k < m; k++) {
					int x = topic[i][k] | topic[j][k];
					if (x == 1) {
						count = count + 1;
					}
				}
				if (max < count) {
					teams = 1;
					max = count;
				} else if (max == count) {
					teams++;
				}
			}
		}

		System.out.println(max);
		System.out.println(teams);

		in.close();
	}
}
