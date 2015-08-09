package algorithms.warmup;

/*
 * Problem Statement
 * Solve Me Second
 * https://www.hackerrank.com/challenges/solve-me-second
 */

import java.util.*;

public class SolveMeSecond {
	static int solution(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t;
		int sum;
		int a, b;
		t = in.nextInt();
		for (int i = 0; i < t; i++) {
			a = in.nextInt();
			b = in.nextInt();
			sum = solution(a, b);
			System.out.println(sum);
		}
		
		in.close();
	}

}
