package algorithms.warmup;

/*
 * Problem Statement
 * Service Lane
 * https://www.hackerrank.com/challenges/service-lane
 */

import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int freewayLength = in.nextInt();
		int cases = in.nextInt();

		int[] freeway = new int[freewayLength];
		for (int i = 0; i < freewayLength; i++) {
			freeway[i] = in.nextInt();
		}

		for (int i = 0; i < cases; i++) {
			int from = in.nextInt();
			int to = in.nextInt();

			int size = 3;
			for (int j = from; j <= to; j++) {
				if (freeway[j] < size) {
					size = freeway[j];
				}
			}
			System.out.println(size);
		}

		in.close();
	}

}
