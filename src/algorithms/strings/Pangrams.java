package algorithms.strings;

/*
 * Problem Statement
 * Pangrams
 * https://www.hackerrank.com/challenges/pangrams
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Pangrams {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String t = in.nextLine().toLowerCase();

//		System.out.println(t);

		if (t.length() >= 1 && t.length() <= 1000) {
			String a[] = new String[t.length()];

			for (int i = 0; i < t.length(); i++) {
				a[i] = t.charAt(i) + " ";
			}

			TreeSet<String> set = new TreeSet<>(Arrays.asList(a));
			set.pollFirst();
//			System.out.println(set.size());
//			for (String str : set) {
//				System.out.println(str);
//			}
			

			if (set.size() == 26) {
				System.out.println("pangram");
			} else {
				System.out.println("not pangram");
			}
		}
		in.close();
	}

}
