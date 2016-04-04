package algorithms.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			String s1 = in.next();
			String s2 = in.next();

			Set<Character> set1 = new HashSet<Character>();
			Set<Character> set2 = new HashSet<Character>();

			for (int j = 0; j < s1.length(); j++) {
				set1.add(s1.charAt(j));
			}

			for (int j = 0; j < s2.length(); j++) {
				set2.add(s2.charAt(j));
			}

			set1.retainAll(set2);

			if (set1.size() > 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

			set1.clear();
			set2.clear();
		}

		in.close();
	}

}
