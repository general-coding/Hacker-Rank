package datastructures.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String key = in.next();
			if (hm.get(key) == null) {
				hm.put(key, 1);
			} else {
				int value = hm.get(key);
				hm.put(key, ++value);
				// System.out.println(key + " " + hm.get(key));
			}

		}

		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			Integer val = hm.get(in.next());
			if (val == null) {
				System.out.println(0);
			} else {
				System.out.println(val);
			}
		}

		in.close();
	}

}
