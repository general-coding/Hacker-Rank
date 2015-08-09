package algorithms.warmup;

/*
 * Problem Statement
 * Cut The Sticks
 * https://www.hackerrank.com/challenges/cut-the-sticks 
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		int lengths[] = new int[n];
		List<Integer> output = new LinkedList<Integer>();

		for (int i = 0; i < n; i++)
			lengths[i] = in.nextInt();

		in.close();
		Arrays.sort(lengths);

		for (int i = 0; i < n; i++) {
			// System.out.println("i: " + lengths[i]);
			if (lengths[i] == 0) {
				// System.out.println();
				continue;
			} else {
				output.add(n - i);
				final int v = lengths[i];
				for (int j = i; j < n; j++) {
					// System.out.print("j: " + lengths[j]);
					lengths[j] -= v;
					// System.out.println(" j: " + lengths[j]);
				}
			}
			// System.out.println();
		}

		for (int i = 0; i < output.size(); i++)
			System.out.println(output.get(i));

		in.close();
	}
}
