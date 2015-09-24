package algorithms.bitmanipulation;

/*
 * Problem Statement
 * Lonely Integer
 * https://www.hackerrank.com/challenges/lonely-integer
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class LonelyInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();

		if (N % 2 == 1) {
			Map<String, AtomicInteger> A = new HashMap<String, AtomicInteger>();

			for (int i = 0; i < N; i++) {
				String key = in.next();
				AtomicInteger value = A.get(key);
				if (value == null) {
					A.put(key, new AtomicInteger(1));
				} else {
					value.incrementAndGet();
				}
			}

			for (String key : A.keySet()) {
				if (A.get(key).toString().equalsIgnoreCase("1")) {
					System.out.println(key);
				}
			}
		}

		in.close();
	}

}
