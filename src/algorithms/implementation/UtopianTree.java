package algorithms.implementation;

/*
 * Problem Statement 
 * HackerRank Utopian Tree
 * https://www.hackerrank.com/challenges/utopian-tree
 */

import java.util.*;

public class UtopianTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int a[] = new int[t];
		for (int i = 0; i < t; i++) {
			a[i] = in.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			int sum = 1;
			int count = 1;
			// System.out.println(a[i]);
			for (int j = 0; j < a[i]; j++) {
				if (count % 2 != 0) {
					sum = sum * 2;
					// System.out.println("x" + "," + j + "," + count + "," +
					// sum);
				}
				if (count % 2 == 0) {
					sum = sum + 1;
					// System.out.println("y" + "," + j + "," + count + "," +
					// sum);
				}
				count++;
			}
			System.out.println(sum);
		}

		in.close();
	}

}
