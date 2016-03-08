package jv.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class JavaArraylist {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

		for (int i = 1; i < n + 1; i++) {
			int d = in.nextInt();
			ArrayList<Integer> al = new ArrayList<Integer>();

			for (int j = 0; j < d; j++) {
				al.add(in.nextInt());
			}

			map.put(i, al);
		}

		int q = in.nextInt();

		for (int i = 0; i < q; i++) {
			int x = in.nextInt();
			int y = in.nextInt();

			try {
				System.out.println((map.get(x)).get(y - 1));
			} catch (IndexOutOfBoundsException e) {
				System.out.println("ERROR!");
			}
		}

		in.close();
	}
}
